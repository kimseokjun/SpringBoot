package com.springboot.web2seokjun20240220.web.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Builder
@Data
public class TestRespDto {
	
	private String username;
	private String password;
	
}