package com.springboot.web2seokjun20240220.web.dto.board;

import com.springboot.web2seokjun20240220.domain.board.Board;

import lombok.Data;

@Data
public class CreateBoardReqDto {

	private String title;
	private int usercode;
	private String content;
	
	
	public Board toEntity() {
		
		return Board.builder()
				.title(title)
				.usercode(usercode)
				.content(content)
				.build();
	}
	
	public void showInfo() {
		System.out.println(title);
		System.out.println(usercode);
		System.out.println(content);
		System.out.println("end");
	}
	
}
