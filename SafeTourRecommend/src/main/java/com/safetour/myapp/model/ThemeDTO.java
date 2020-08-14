package com.safetour.myapp.model;

import java.io.Serializable;

public class ThemeDTO implements Serializable, FormDTO{
	private String Sentence;
	private String Gender;
	private int Age;
	private String partner;
	private String address;
	
	public ThemeDTO() {
		// TODO Auto-generated constructor stub
	}

	public ThemeDTO(String sentence, String gender, int age, String partner, String address) {
		
		this.Sentence = sentence;
		this.Gender = gender;
		this.Age = age;
		this.partner = partner;
		this.address = address;
	}

	public String getSentence() {
		return Sentence;
	}

	public void setSentence(String sentence) {
		Sentence = sentence;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getPartner() {
		return partner;
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "UserDTO [Sentence=" + Sentence + ", Gender=" + Gender + ", Age=" + Age + ", partner=" + partner
				+ ", address=" + address + "]";
	}

	@Override
	public void Insert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String Read() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int Update() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Delete() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	
}
