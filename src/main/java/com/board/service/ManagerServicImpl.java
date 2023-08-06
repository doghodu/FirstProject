package com.board.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.board.dao.ManagerDAO;
import com.board.domain.ManagerDTO;


@Service
public class ManagerServicImpl implements ManagerService{
	
	
	@Inject
	private ManagerDAO dao;

	@Override
	public ManagerDTO login(ManagerDTO dto) {
		return dao.login(dto);
	}
	
	@Override
	public int register(ManagerDTO dto) throws Exception {
		return dao.register(dto);
	}
}
