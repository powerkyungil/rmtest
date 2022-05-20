package co.rm.test.buy.service;

import java.util.List;

import co.rm.test.vo.BuyVO;

public interface BuyService {
	List<BuyVO> buySelect();
	int buyInsert(BuyVO buy);
}
