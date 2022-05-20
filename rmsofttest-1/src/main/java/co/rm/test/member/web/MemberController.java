package co.rm.test.member.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.rm.test.member.service.MemberService;
import co.rm.test.vo.MemberVO;

@RestController
public class MemberController {
	
	@Autowired
	private MemberService memberDao;
	
	@GetMapping("/members")
	public List<MemberVO> memberSelect() {
		List<MemberVO> allMembers = memberDao.memberSelect();
		
		return allMembers;
	}
}
