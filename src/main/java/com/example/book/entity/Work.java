package com.example.book.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name="workDetail")
public class Work {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int workId;
	
	private String workName;
	
	private long salary;
}
