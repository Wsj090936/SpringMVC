package sj.wsj.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import sj.wsj.dao.ItemsMapper;
import sj.wsj.domain.Items;
import sj.wsj.service.ItemsService;
@Service
public class ItemsServiceImpl implements ItemsService {
	@Resource
	private ItemsMapper itemsMapper;
	@Override
	public List<Items> findAllItems() {
		List<Items> list = itemsMapper.findAll();
		return list;
	}
	@Override
	public Items findById(Integer id) {
		Items item = itemsMapper.findById(id);
		return item;
	}
	@Override
	public void updata(Items items) {
		itemsMapper.updata(items);
	}

}
