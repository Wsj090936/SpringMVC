package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MyController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//�������󣬽��ղ�������֤����
		//��װ����������ҵ���߼�
		//������ͼ
		ModelAndView mv = new ModelAndView();
		//����ҳ���������
		mv.addObject("hello", "�����ҵĵ�һ��SpringMVC����");
		//ָ����ת����ͼ
		//������ͼ
//		mv.setViewName("/WEB-INF/jsp/index.jsp");
		//�����߼���ͼ���Ƽ�ʹ��
		mv.setViewName("index");
		return mv;
	}

}
