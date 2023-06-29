package com.board.service;

import com.board.domain.MemberDTO;

public interface MemberService {

	MemberDTO login(MemberDTO dto);

	public void register(MemberDTO dto) throws Exception;


}
