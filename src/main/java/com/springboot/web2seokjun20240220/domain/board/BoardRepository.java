package com.springboot.web2seokjun20240220.domain.board;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardRepository {
	
	public int save(Board board);
	
	public Board findBoardByBoardcode(int boardcode);
}
