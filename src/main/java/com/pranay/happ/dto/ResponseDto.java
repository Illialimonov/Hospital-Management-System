package com.pranay.happ.dto;

import javax.persistence.Entity;

import com.pranay.happ.entity.UserRequest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResponseDto {
	
	private String msg;

}