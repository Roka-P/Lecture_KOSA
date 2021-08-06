package com.kosa.member;

public class MemberController {
	
	IMemberService memberService;

	public void setMemberService(IMemberService memberService) {
		this.memberService = memberService;
	}


	public void printInfo() {
		MemberVO vo = memberService.getMemberInfo();
		System.out.println(vo.toString());
	}
}
