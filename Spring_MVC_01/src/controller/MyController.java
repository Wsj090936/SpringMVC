package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MyController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//接收请求，接收参数，验证参数
		//封装参数，调用业务逻辑
		//返回视图
		ModelAndView mv = new ModelAndView();
		//设置页面回显数据
		mv.addObject("hello", "这是我的第一个SpringMVC程序");
		//指定跳转的视图
		//物理视图
//		mv.setViewName("/WEB-INF/jsp/index.jsp");
		//设置逻辑视图。推荐使用
		mv.setViewName("index");
		return mv;
	}

}
