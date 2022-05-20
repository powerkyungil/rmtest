package co.rm.test.company.service;

import java.util.List;

import co.rm.test.vo.CompanyVO;

public interface CompanyService {
	List<CompanyVO> companySelect();
	int companyInsert(CompanyVO com);
	int companyUpdate(CompanyVO com);
}
