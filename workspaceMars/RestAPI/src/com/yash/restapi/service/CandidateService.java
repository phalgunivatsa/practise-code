package com.yash.restapi.service;

import java.util.List;

import com.yash.restapi.database.CandidateDataBaseClass;
import com.yash.restapi.model.Candidate;

public class CandidateService {
	CandidateDataBaseClass candidateDataBaseClass= new CandidateDataBaseClass();
	
	public Candidate getCandidateById(int candidate_id) {
		return candidateDataBaseClass.getCandidateById(candidate_id);
	}

	public List<Candidate> getAllCandidates() {
		return candidateDataBaseClass.getAllCandidates();
	}

	public List<Candidate> getCandidateByCity(String city) {
		return candidateDataBaseClass.getCandidateByCity(city);
	}

}
