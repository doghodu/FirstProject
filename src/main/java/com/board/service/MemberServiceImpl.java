package com.board.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.board.dao.MemberDAO;
import com.board.domain.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {

	@Inject
	private MemberDAO dao;

	@Override
	public MemberDTO login(MemberDTO dto) {
		return dao.login(dto);
	}
	
	@Override 
	public void register(MemberDTO dto) throws Exception{
		
		dao.register(dto);
	}
}