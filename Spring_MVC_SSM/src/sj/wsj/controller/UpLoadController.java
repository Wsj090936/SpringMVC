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
		//将request对象转换为多部分request对象，因为请求的request是流，无法操作
		MultipartHttpServletRequest ml = (MultipartHttpServletRequest) request;
		//根据ajax穿过来的fileName获取文件对象
		CommonsMultipartFile file = (CommonsMultipartFile) ml.getFile(fileName);
		byte[] fbytes = file.getBytes();//获取文件流
		//解决文件名重复的问题，并创建文件名
		String newFilename = "";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");//以当前时间为文件名，精确到毫秒
		newFilename = sdf.format(new Date());
		Random r = new Random();
		
		for(int i = 0;i < 3;i++){
			newFilename += r.nextInt(10);//再次给文件名加上随机数以确保不会重复
		}
		//获取文件的扩展名
		String originalFilename = file.getOriginalFilename();//获取文件的原名
		String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
		//创建服务器，进行上传
		Client client = Client.create();
		//将文件关联到文件服务器
		WebResource resource = client.resource("http://127.0.0.1:8003/Spring_MVC_image"+"/upload/"+newFilename+suffix);
		resource.put(String.class, fbytes);//上传
		
		//给ajax回调的值
		String fullpath = "http://127.0.0.1:8003/Spring_MVC_image"+"/upload/"+newFilename+suffix;//绝对路径
		String relativepath = "/upload/"+newFilename+suffix;//在数据库中存放的路径
		//创建一个json格式的字符串，将其反馈给ajax的回调函数seccess
		String result = "{\"fullpath\":\""+fullpath+"\",\"relativepath\":\""+relativepath+"\"}";
		out.print(result);
	}
}
