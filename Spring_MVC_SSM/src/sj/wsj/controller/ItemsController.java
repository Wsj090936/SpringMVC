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
}
