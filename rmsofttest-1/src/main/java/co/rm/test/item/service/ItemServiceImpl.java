package co.rm.test.item.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.rm.test.item.mapper.ItemMapper;
import co.rm.test.vo.ItemVO;

@Repository("itemDao")
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private ItemMapper map;

	@Override
	public List<ItemVO> itemSelect() {
		return map.itemSelect();
	}

	@Override
	public int itemInsert(ItemVO item) {
		return map.itemInsert(item);
	}

	@Override
	public int itemUpdate(ItemVO item) {
		return map.itemUpdate(item);
	}
	
	
}
