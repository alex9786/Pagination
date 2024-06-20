package com.example.book.controller;

import org.springframework.data.domain.Page;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.book.dto.BookPage;
import com.example.book.dto.ExpertDto;
import com.example.book.entity.Expert;
import com.example.book.service.ExpertService;

@RestController
@RequestMapping("/rest")
public class ExpertController {
	
	@Autowired
	ExpertService expertService;
	
	@PostMapping("/post")
	public ExpertDto post(@RequestBody ExpertDto dto) {
		return expertService.post(dto);
	}
	
	@GetMapping("/getExpert/{id}")
	public ExpertDto get(@PathVariable ("id") int id) {
		return expertService.get(id);
	}
	
/*********** PAGINATION *************/	

	
	
	@GetMapping("/get/{page}/{size}")
	public Page<Expert> getDetail(@PathVariable int page,@PathVariable int size){
		return expertService.getDetail(page,size);
	}

	@GetMapping("/find/{pageNo}/{size}")
	public List<Expert> getAllExpert(@PathVariable int pageNo,int size){
		return expertService.getAllExpert(pageNo,size);
	}
	
	@GetMapping("/getAll/{page}")	
	public BookPage<Expert> getAll (@PathVariable int page,@RequestParam(defaultValue = "5") int size){
		return expertService.getAll(page,size);
	}
	
	
	@GetMapping("/findAll/{page}")
	public Page<Expert> getExpert(
			@PathVariable int page,
			@RequestParam(defaultValue = "5") int size){
		return expertService.getExpert(page,size);
	}
	
	
	
	
	
	

}
