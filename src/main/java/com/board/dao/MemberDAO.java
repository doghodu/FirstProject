package com.board.dao;

import com.board.domain.MemberDTO;

public interface MemberDAO {

	MemberDTO login(MemberDTO dto);

	public void register(MemberDTO dto) throws Exception;

}
