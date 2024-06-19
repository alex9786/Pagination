package com.example.book.service;

import org.springframework.data.domain.Page;

import com.example.book.dto.BookPage;
import com.example.book.dto.ExpertDto;
import com.example.book.entity.Expert;

public interface ExpertService {

	ExpertDto post(ExpertDto dto);

	ExpertDto get(int id);

	Page<Expert> getExpert(int page, int size);

	Page<Expert> getDetail(int page, int size);

	BookPage<Expert> getAll(int page, int size);

	
}
