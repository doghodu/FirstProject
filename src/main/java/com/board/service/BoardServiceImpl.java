package com.board.service;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import com.board.dao.BoardDAO;
import com.board.domain.BoardDTO;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO dao;

	@Override
	public List list() throws Exception {
		return dao.list();
	}
	
	@Override
	public int regi(BoardDTO dto) throws Exception {
		
		if (dao.getMaxSeq() == null) { // 掲示文が存在しない時
			dto.setSeq(1); // SEQは 1
		} else { // 掲示文が存在する時
			dto.setSeq(dao.getMaxSeq() + 1); // 最大値+1
		}
		
		return dao.regi(dto);
	}
	
	@Override
	public BoardDTO view(int seq) {
		dao.updateReadCount(seq);
		return dao.view(seq);
	}


	@Override
	public int update(BoardDTO dto) {
		return dao.update(dto);
	}

	@Override
	public int delete(int seq) {
		return dao.delete(seq);
	}
}