package com.springboot.web2seokjun20240220.web.controller.api.board;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web2seokjun20240220.service.board.BoardService;
import com.springboot.web2seokjun20240220.web.dto.CMRespDto;
import com.springboot.web2seokjun20240220.web.dto.board.CreateBoardReqDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/board")
@RequiredArgsConstructor
public class BoardController {
   //객체를 만들고 required 붙여주면 
   private final BoardService boardService;
	
//	@PostMapping("/content")
//	public ResponseEntity<?> addBoard(String title){
//		System.out.println("게시글 작성완료");
//		System.out.println("title: " +title);
//		return new ResponseEntity<>(title + "게시글 작성 성공", HttpStatus.OK);
//	}
	
//	@PostMapping("/nowContent")
//	public ResponseEntity<?> addBoardNow(String title, int usercode, String content){
//		System.out.println("title : " + title);
//		System.out.println("usercode : " + usercode);
//		System.out.println("content : " + content);
//		
//		return ResponseEntity.ok().body("test");
//		
//	}
	@PostMapping("/nowContent")
	public ResponseEntity<?> addBoardNow(CreateBoardReqDto createBoardReqDto){
		createBoardReqDto.showInfo();
//		System.out.println("title : " + title);
//		System.out.println("usercode : " + usercode);
//		System.out.println("content : " + content);
		
		return ResponseEntity.ok().body("test");
		
	}
	
	   @PostMapping("/content")    //Json으로 받을때는 RequestBody 붙여줘야함
	   public ResponseEntity<?> addBoard(@RequestBody CreateBoardReqDto createBoardReqDto){
//	      boardService.createBoard(createBoardReqDto) 는 게시글 생성이라고 보면됨
	      // responseData는 게시글 생성이 성공했는가? 
	      boolean responseData = false;
	      try {
	         System.out.println(createBoardReqDto);
	         boardService.createBoard(createBoardReqDto);
	      } catch (Exception e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	         return ResponseEntity.internalServerError().body(responseData);
	      }
	      return ResponseEntity.ok().body(new CMRespDto<>(1,"게시글 등록 성공",null));
	   }
}


