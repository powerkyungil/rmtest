package co.rm.test.item.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import co.rm.test.item.service.ItemService;
import co.rm.test.vo.ItemVO;

@RestController
public class ItemController {
	
	@Autowired
	private ItemService itemDao;
	
	@GetMapping("/items")
	public List<ItemVO> itemSelect() {
		List<ItemVO> allitem = itemDao.itemSelect();
		
		return allitem;
	}
	
	@PostMapping("/item/new")
	public List<ItemVO> itemInsert(ItemVO item) {
		itemDao.itemInsert(item);
		return itemDao.itemSelect();
	}
	
	@PutMapping("/item/{com}")
	public List<ItemVO> itemUpdate(@PathVariable String com, ItemVO item) {
		item.setCompany(com);
		itemDao.itemUpdate(item);
		return itemDao.itemSelect();
	}
	
	
}
