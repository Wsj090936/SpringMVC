package sj.wsj.service;

import java.util.List;

import sj.wsj.domain.Items;

public interface ItemsService {
	public List<Items> findAllItems();
	public Items findById(Integer id);
	public void updata(Items items);
}
