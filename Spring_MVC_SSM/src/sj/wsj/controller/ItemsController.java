package sj.wsj.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sj.wsj.domain.Items;
import sj.wsj.service.ItemsService;

@Controller
@RequestMapping("/items")
public class ItemsController {
	@Resource
	private ItemsService itemsService;
	@RequestMapping("list")
	public String list(Model model){
		List<Items> list = itemsService.findAllItems();
		model.addAttribute("itemsList", list);
		return "itemsList";
	}
	
	@RequestMapping("edit")
	public String toEdit(Integer id,Model model){
		Items item = itemsService.findById(id);
		model.addAttribute("item", item);
		return "editItem";
	}
	@RequestMapping("update")
	public String Updata(Items items){
		itemsService.updata(items);
		return "redirect:list.do";
	}
}
