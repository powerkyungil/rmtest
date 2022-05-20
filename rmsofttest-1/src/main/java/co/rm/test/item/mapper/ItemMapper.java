package co.rm.test.item.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import co.rm.test.vo.ItemVO;

@Mapper
public interface ItemMapper {
	List<ItemVO> itemSelect();
	int itemInsert(ItemVO item);
	int itemUpdate(ItemVO item);
	
}
