package co.rm.test.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import co.rm.test.member.mapper.MemberMapper;
import co.rm.test.vo.MemberVO;

@Repository("memberDao")
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	MemberMapper map;
	
	@Override
	public List<MemberVO> memberSelect() {
		return map.memberSelect();
	}
	
}
