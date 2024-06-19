package com.example.book.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExpertDto {

	private int id;
	
	private String name;
	
	private int age;
	
	private String gender;
	
	private String city;
	
}
