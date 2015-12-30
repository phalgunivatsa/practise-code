package com.yash.restapi.model;



import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Marks {
	private int marks_id;
	private int candidate_id;
	private String standard;
	private int totalMarks;
	
	
	public Marks(int marks_id, int candidate_id, String standard, int totalMarks) {
		super();
		this.marks_id = marks_id;
		this.candidate_id = candidate_id;
		this.standard = standard;
		this.totalMarks = totalMarks;
	}


	public Marks() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getMarks_id() {
		return marks_id;
	}


	public void setMarks_id(int marks_id) {
		this.marks_id = marks_id;
	}


	public int getCandidate_id() {
		return candidate_id;
	}


	public void setCandidate_id(int candidate_id) {
		this.candidate_id = candidate_id;
	}


	public String getStandard() {
		return standard;
	}


	public void setStandard(String standard) {
		this.standard = standard;
	}


	public int getTotalMarks() {
		return totalMarks;
	}


	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	
	
	
}
