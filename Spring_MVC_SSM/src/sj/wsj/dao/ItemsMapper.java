package sj.wsj.dao;

import java.util.List;

import sj.wsj.domain.Items;

public interface ItemsMapper {
	public List<Items> findAll();
}
