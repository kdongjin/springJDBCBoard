package com.board.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Board {
	private int no; 
	private String title; 
	private String content; 
	private String writer; 
	private Date regDate;
	//검색항목	
	private String searchType;
	private String keyword; 
}
