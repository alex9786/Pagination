package com.example.book.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;

import com.example.book.dto.BookPage;
import com.example.book.dto.ExpertDto;
import com.example.book.entity.Expert;
import com.example.book.repository.ExpertRepository;

@Service
public class ExpertServiceImp implements ExpertService{

	@Autowired
	ExpertRepository expertRepo;
	
	@Override
	public ExpertDto post(ExpertDto dto) {
		Expert entity = new Expert();
		entity.setId(dto.getId());
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setGender(dto.getGender());
		entity.setCity(dto.getCity());
	    expertRepo.save(entity);
	    return dto;
	}

	@Override
	public ExpertDto get(int id) {
		Optional<Expert> entity=expertRepo.findById(id);
		Expert expert=entity.get();
		ExpertDto dto = new ExpertDto();
		dto.setId(expert.getId());
		dto.setName(expert.getName());
		dto.setAge(expert.getAge());
		dto.setGender(expert.getGender());
		dto.setCity(expert.getCity());
		return dto;
	}

	@Override
	public Page<Expert> getExpert(int page, int size) {
		Pageable pageable = PageRequest.of(page, size);
		return expertRepo.findAll(pageable);
	}

	@Override
	public Page<Expert> getDetail(int page, int size) {
		Pageable pageable = PageRequest.of(page, size);
		return expertRepo.findAll(pageable);
	}

	@Override
	public BookPage<Expert> getAll(int page, int size) {
		Pageable pageable= PageRequest.of(page, size);
		Page<Expert> page2= expertRepo.findAll(pageable);
		BookPage<Expert> bookPage = new BookPage<Expert>();
		bookPage.setContant(page2.getContent());
		bookPage.setFrist(page2.getNumber());
		bookPage.setLast(page2.getNumber());
		return bookPage;
	}

	

}
