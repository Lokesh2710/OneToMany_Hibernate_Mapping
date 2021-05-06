package com.jocata.Mapping_Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop {
	

	@Id
	private int laptop_id;
	private String laptop_name;
	
	public int getLaptop_id() {
		return laptop_id;
	}
	public void setLaptop_id(int laptop_id) {
		this.laptop_id = laptop_id;
	}
	public String getLaptop_name() {
		return laptop_name;
	}
	public void setLaptop_name(String string) {
		this.laptop_name = string;
	}
	
	

}
