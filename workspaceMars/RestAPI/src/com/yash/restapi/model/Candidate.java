package com.yash.restapi.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Candidate {
	private int candidate_id;
	private String name;
	private String city;
	
	
	
	public Candidate(int candidate_id, String name, String city) {
		super();
		this.candidate_id = candidate_id;
		this.name = name;
		this.city = city;
		
	}


	public Candidate() {
		super();
		
	}
	
	
	public int getCandidate_id() {
		return candidate_id;
	}


	public void setCandidate_id(int candidate_id) {
		this.candidate_id = candidate_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	
}
