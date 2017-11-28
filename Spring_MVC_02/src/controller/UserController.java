package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import domain.User;
import domain.UserExt;

@Controller
@RequestMapping("/user")
public class UserController {
	@RequestMapping("receiveId")
	public String receiveId(Integer id){
		System.out.println(id);
		return "success";
	}
	
	@RequestMapping("receiveUser")
	public String receiveUser(User user){
		System.out.println(user);
		return "success";
	}
	
	@RequestMapping("receiveUserExt")
	public String receiverUserExt(UserExt userExt){
		System.out.println(userExt);
		return "success";
	}
	@RequestMapping("receiveArray")
	public String receiverArray(Integer[] arg){
		System.out.println(arg);
		return "success";
	}
	
	@RequestMapping("receiveList")
	private String receiverArray(UserExt userExt){
		System.out.println(userExt);
		return "success";
	}
	@RequestMapping("receiveMap")
	public String receiverMap(UserExt userExt){
		System.out.println(userExt);
		return "success";
	}
	
	
	
	
	
	@RequestMapping("toAdd")
	public String toAdd(){//Ç°ÍùaddÒ³Ãæ
		return "add";
	}
}
