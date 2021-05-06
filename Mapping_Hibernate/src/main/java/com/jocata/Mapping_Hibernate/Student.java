package com.jocata.Mapping_Hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
	private int rollno;
	private String name;
	private int marks;
	
	@OneToMany
	private List<Laptop> lap_list = new ArrayList<Laptop>();
	
	public List<Laptop> getLap_list() {
		return lap_list;
	}
	public void setLap_list(List<Laptop> lap_list) {
		this.lap_list = lap_list;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
}
