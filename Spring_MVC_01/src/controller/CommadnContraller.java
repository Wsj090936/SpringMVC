package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import domain.User;

public class CommadnContraller extends AbstractCommandController{
	public CommadnContraller(){//ָ����������װ���ĸ�JAVAbean����װ����command������
		this.setCommandClass(User.class);
	}
	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		User user = (User) command;
		ModelAndView mv = new ModelAndView();
		mv.addObject("user",user);
		mv.setViewName("index");
		return mv;
	}

}
