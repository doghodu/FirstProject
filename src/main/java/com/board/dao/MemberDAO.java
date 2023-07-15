package com.board.dao;

import com.board.domain.MemberDTO;

public interface MemberDAO {

	MemberDTO login(MemberDTO dto);

	int register(MemberDTO dto);

	


}
