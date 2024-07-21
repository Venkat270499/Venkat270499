package com.nt.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity(name="Customer")
@NoArgsConstructor
@AllArgsConstructor
public class CustomerClass {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int custid;
	
	@Column(length = 100)
	String cname;
	
	@Column(length = 100)
	String gender;
	
	@Column(length = 100)
	String city;
	
	
	int age;

	@Override
	public String toString() {
		return "CustomerClass [cid=" + custid + ", cname=" + cname + ", gender=" + gender + ", city=" + city + ", age="
				+ age + "]";
	}
	
	
}
