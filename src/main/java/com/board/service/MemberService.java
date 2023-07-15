package com.board.service;

import com.board.domain.MemberDTO;

public interface MemberService {

	MemberDTO login(MemberDTO dto);

	public int register(MemberDTO dto) throws Exception;

	


}
