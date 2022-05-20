package co.rm.test.buy.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import co.rm.test.buy.service.BuyService;
import co.rm.test.vo.BuyVO;

@RestController
public class BuyController {
	
	@Autowired
	private BuyService buyDao;
	
	@GetMapping("/buys")
	public List<BuyVO> buySelect() {
		List<BuyVO> allBuy = buyDao.buySelect();
		
		return allBuy;
	}
	
	@PostMapping("/buy/new")
	public List<BuyVO> buyInsert(BuyVO buy) {
		buyDao.buyInsert(buy);
		return buyDao.buySelect();
	}
	
}
