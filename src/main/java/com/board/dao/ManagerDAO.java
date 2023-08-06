package com.board.dao;

import com.board.domain.ManagerDTO;

public interface ManagerDAO {

	
	ManagerDTO login(ManagerDTO dto);
	
	int register(ManagerDTO dto);

}
