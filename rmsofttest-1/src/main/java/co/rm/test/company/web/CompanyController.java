package co.rm.test.company.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import co.rm.test.company.service.CompanyService;
import co.rm.test.vo.CompanyVO;

@RestController
public class CompanyController {
	
	@Autowired
	private CompanyService comDao;
	
	@GetMapping("/coms")
	public List<CompanyVO> companySelect() {
		List<CompanyVO> allCom = comDao.companySelect();
		
		return allCom;
	}
	
	@PostMapping("/com/new")
	public List<CompanyVO> companyInsert(CompanyVO com) {
		comDao.companyInsert(com);
		return comDao.companySelect();
	}
	
	@PutMapping("/com/{com}")
	public List<CompanyVO> companyUpdate(@PathVariable String com, CompanyVO company) {
		company.setCompany(com);
		comDao.companyUpdate(company);
		return comDao.companySelect();
	}
	
}
