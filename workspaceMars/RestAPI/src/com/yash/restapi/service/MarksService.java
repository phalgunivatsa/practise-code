package com.yash.restapi.service;

import java.util.List;

import com.yash.restapi.database.CandidateDataBaseClass;
import com.yash.restapi.model.Marks;

public class MarksService {
	CandidateDataBaseClass candidateDataBaseClass = new CandidateDataBaseClass();
	
	public List<Marks> getMarksByStandard(String standard) {
		return candidateDataBaseClass.getMarksByStandard(standard);
		
	}
}
