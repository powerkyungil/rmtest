package co.rm.test.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import co.rm.test.vo.MemberVO;

@Mapper
public interface MemberMapper {
	List<MemberVO> memberSelect();
	
}
