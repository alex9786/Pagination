package com.example.book.dto;

import java.util.List;
import lombok.Data;


@Data
public class BookPage<T> {
	
	private List<T> contant;
	
	private int pageNo;
	
	private int count;
	
	private boolean last;

}
