package co.rm.test.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.rm.test.company.mapper.CompanyMapper;
import co.rm.test.vo.CompanyVO;

@Repository("ComDao")
public class CompanyServiceImpl implements CompanyService{
	
	@Autowired
	private CompanyMapper map;

	@Override
	public List<CompanyVO> companySelect() {
		return map.companySelect();
	}

	@Override
	public int companyInsert(CompanyVO com) {
		return map.companyInsert(com);
	}

	@Override
	public int companyUpdate(CompanyVO com) {
		return map.companyUpdate(com);
	}
	
	
}
