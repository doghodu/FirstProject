package com.board.service;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import com.board.dao.BoardDAO;
import com.board.dao.MemberDAO;
import com.board.domain.BoardDTO;
import com.board.domain.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {

	@Inject
	private MemberDAO dao;

	@Override
	public MemberDTO login(MemberDTO dto) {
		return dao.login(dto);
	}
}