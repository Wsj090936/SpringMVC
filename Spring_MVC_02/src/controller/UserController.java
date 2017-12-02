package controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	@RequestMapping("list")
	public String list(Model model){
		List<User> list = new ArrayList<>();
		User user1 = new User();
		user1.setUsername("汤姆");
		user1.setPassword("123456");
		user1.setId(1);
		User user2 = new User();
		user2.setUsername("jerry");
		user2.setPassword("654321");
		user2.setId(2);
		User user3 = new User();
		user3.setUsername("rick");
		user3.setPassword("23451");
		user3.setId(3);
		list.add(user1);
		list.add(user2);
		list.add(user3);
		model.addAttribute("userList", list);
		return "list";
	}
	@RequestMapping("upDateById")
	public String upData(Integer id,Model model){//前往回显页面
		User user1 = new User();
		user1.setId(id);
		user1.setUsername("tom");
		user1.setPassword("22222");
		model.addAttribute("user", user1);
		return "edit";
	}
	
	
	
	
	@RequestMapping("toAdd")
	public String toAdd(){//前往add页面
		return "add";
	}
}
