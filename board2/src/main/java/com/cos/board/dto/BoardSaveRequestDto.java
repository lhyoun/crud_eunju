package com.cos.board.dto;

import com.cos.board.model.Board;

import lombok.Data;

@Data
public class BoardSaveRequestDto {
	/* 이 DTO가 필요한 이유는 CREATE/UPDATE 할 때 
	   title과 content만 받아오는데 
	   Board class는 다른 필드도 있어서 
	   짝이 맞지 않아서 임시의 DTO에 담아두는 용도 */
	public String title;
	public String content;
	
	public static Board toEntity(BoardSaveRequestDto dto) {
		Board board = Board.builder().title(dto.getTitle()).content(dto.getContent()).build();
		return board;
	}
}
