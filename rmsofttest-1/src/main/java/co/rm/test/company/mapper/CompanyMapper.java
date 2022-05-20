package co.rm.test.company.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import co.rm.test.vo.CompanyVO;

@Mapper
public interface CompanyMapper {
	List<CompanyVO> companySelect();
	int companyInsert(CompanyVO com);
	int companyUpdate(CompanyVO com);
}
