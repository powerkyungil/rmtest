package co.rm.test.item.service;

import java.util.List;

import co.rm.test.vo.ItemVO;

public interface ItemService {
	List<ItemVO> itemSelect();
	int itemInsert(ItemVO item);
	int itemUpdate(ItemVO item);
}
