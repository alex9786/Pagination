package com.example.book.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="experts")

public class Expert {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	
	private int id;
	
	private String name;
	
	private int age;
	
	private String gender;
	
	private String city;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="wId")
	private Work work;
	

}
