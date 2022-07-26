package com.spring.boardweb.entity;

import java.io.Serializable;

import lombok.Data;

//두 개 이상의 키 값을 가질때는 반드시 class를 만들어서 사용

@Data
public class BoardFileId implements Serializable {
	//private Board board; //board Entity에서 BOARD_SEQ만 꺼내서 사용
	private int board;
	private int fileSeq;
}
