package com.kosa.member;

public class MemberService implements IMemberService {

	@Override
	public MemberVO getMemberInfo() {
		MemberVO vo = new MemberVO();
		vo.setMemberID("1234");
		vo.setName("홍길동");
		vo.setAge(20);
		vo.setEmail("kildong@hong.com");
		return vo;
	}

}
