package sj.wsj.controller;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

@Controller
@RequestMapping("/upload")
public class UpLoadController {
	@RequestMapping("uploadpic")
	public void uploadPic(HttpServletRequest request,String fileName,PrintWriter out){
		//��request����ת��Ϊ�ಿ��request������Ϊ�����request�������޷�����
		MultipartHttpServletRequest ml = (MultipartHttpServletRequest) request;
		//����ajax��������fileName��ȡ�ļ�����
		CommonsMultipartFile file = (CommonsMultipartFile) ml.getFile(fileName);
		byte[] fbytes = file.getBytes();//��ȡ�ļ���
		//����ļ����ظ������⣬�������ļ���
		String newFilename = "";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");//�Ե�ǰʱ��Ϊ�ļ�������ȷ������
		newFilename = sdf.format(new Date());
		Random r = new Random();
		
		for(int i = 0;i < 3;i++){
			newFilename += r.nextInt(10);//�ٴθ��ļ��������������ȷ�������ظ�
		}
		//��ȡ�ļ�����չ��
		String originalFilename = file.getOriginalFilename();//��ȡ�ļ���ԭ��
		String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
		//�����������������ϴ�
		Client client = Client.create();
		//���ļ��������ļ�������
		WebResource resource = client.resource("http://127.0.0.1:8003/Spring_MVC_image"+"/upload/"+newFilename+suffix);
		resource.put(String.class, fbytes);//�ϴ�
		
		//��ajax�ص���ֵ
		String fullpath = "http://127.0.0.1:8003/Spring_MVC_image"+"/upload/"+newFilename+suffix;//����·��
		String relativepath = "/upload/"+newFilename+suffix;//�����ݿ��д�ŵ�·��
		//����һ��json��ʽ���ַ��������䷴����ajax�Ļص�����seccess
		String result = "{\"fullpath\":\""+fullpath+"\",\"relativepath\":\""+relativepath+"\"}";
		out.print(result);
	}
}
