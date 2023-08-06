package com.board.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.board.domain.ManagerDTO;


@Repository
public class ManagerDAOImpl implements ManagerDAO{
	
	@Inject
	private SqlSession sqlSession;
	
	private static String namespace = "com.board.mappers.manager";

	@Override
	public ManagerDTO login(ManagerDTO dto) {
		return sqlSession.selectOne(namespace+".login", dto);
	}
	
	
	
	  
	@Override public int register(ManagerDTO dto) { 
		return sqlSession.insert(namespace+".register", dto); }
	  
}
