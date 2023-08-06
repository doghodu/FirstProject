package com.board.service;

import com.board.domain.ManagerDTO;

public interface ManagerService {

	ManagerDTO login(ManagerDTO dto);

	public int register(ManagerDTO dto) throws Exception;

	
}
