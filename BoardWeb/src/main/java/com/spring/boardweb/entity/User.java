package com.spring.boardweb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

@Entity //이 객체가 Entity객체임을 선언, 필수 값
@Table(name="T_USER") //테이블 어노테이션은 필수 값은 아님, 객체명과 테이블 명이 다를 때 테이블 명을 지정하기 위해 사용
@Data //getter, setter, tostring 등을 자동으로 생성
public class User {
	@Id //키 값으로 지정, 객체안에 있는 모든 속성 값들이 컬럼으로 생성됨
	private String userId;
	
	@Column(nullable=false) //Column 어노테이션은 필수 값은 아님, 컬럼에 옵겨을 주기 위해 사용
	private String userPw;	//nullable: NOT NULL 설정
							//name: 컬럼명 설정
	@Column(nullable=false)	//length: 컬럼에 저장되는 데이터의 최대 길이 설정
	private String userNm;	//unique: 해당 컬럼을 유니크로 설정
	
	@Column(nullable=false)
	private String userMail;
	
	private String userTel;
	
	//@Transient: 해당 속성 값은 컬럼으로 생성하지 않음
	@Transient
	private String userAddress;

}
