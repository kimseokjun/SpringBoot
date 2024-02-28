package com.springboot.web2seokjun20240220.service.board;

import org.springframework.stereotype.Service;

import com.springboot.web2seokjun20240220.domain.board.Board;
import com.springboot.web2seokjun20240220.domain.board.BoardRepository;
import com.springboot.web2seokjun20240220.web.dto.board.CreateBoardReqDto;
import com.springboot.web2seokjun20240220.web.dto.board.CreateBoardRespDto;

import lombok.RequiredArgsConstructor;


@Service	
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{

	private final BoardRepository boardRepository;
	
	
	@Override
	public CreateBoardRespDto createBoard(CreateBoardReqDto boardReqDto) throws Exception {
		
		Board boardEntity = boardReqDto.toEntity();	//디비에 넣기위해 엔티티로 바꿈
		
//		System.out.println("DB가기전: " + boardEntity);
//		int result = boardRepository.save(boardEntity);
//		System.out.println("숫자result:" +result);
//		System.out.println("DB갔다온 후:" +boardEntity);
//		
		boolean insertStatus = boardRepository.save(boardEntity) > 0;
		System.out.println(boardEntity.toCreateBoardDto(insertStatus));
		return boardEntity.toCreateBoardDto(insertStatus);
	
	}

	
}