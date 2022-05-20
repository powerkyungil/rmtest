package co.rm.test.buy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.rm.test.buy.mapper.BuyMapper;
import co.rm.test.vo.BuyVO;

@Repository("buyDao")
public class BuyServiceImpl implements BuyService {
	
	@Autowired
	private BuyMapper map;

	@Override
	public List<BuyVO> buySelect() {
		return map.buySelect();
	}

	@Override
	public int buyInsert(BuyVO buy) {
		return map.buyInsert(buy);
	}

	
}
