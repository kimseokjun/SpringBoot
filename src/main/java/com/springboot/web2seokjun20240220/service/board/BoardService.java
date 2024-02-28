package com.springboot.web2seokjun20240220.service.board;

import com.springboot.web2seokjun20240220.web.dto.board.CreateBoardReqDto;
import com.springboot.web2seokjun20240220.web.dto.board.CreateBoardRespDto;

public interface BoardService {

	   public CreateBoardRespDto createBoard(CreateBoardReqDto createBoardReqDto)throws Exception;
	   //CreateBoardReqDto의 매개변수를 받아서 게시글 생성하는 기능 수행
	   
	}
