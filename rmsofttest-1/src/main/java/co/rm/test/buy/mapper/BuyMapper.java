package co.rm.test.buy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import co.rm.test.vo.BuyVO;

@Mapper
public interface BuyMapper {
	List<BuyVO> buySelect();
	int buyInsert(BuyVO buy);
}
