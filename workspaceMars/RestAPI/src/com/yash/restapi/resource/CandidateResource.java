package com.yash.restapi.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.yash.restapi.model.Candidate;
import com.yash.restapi.model.Marks;
import com.yash.restapi.service.CandidateService;
import com.yash.restapi.service.MarksService;

@Path("/candidates")
public class CandidateResource {
	CandidateService candidateService= new CandidateService(); 
	MarksService marksService=new MarksService();
	
	@GET
	@Path("/select")
	@Produces(MediaType.APPLICATION_XML)
	public List<Candidate>getAllCandidates(){
		return candidateService.getAllCandidates();
	}
	
	@GET
	@Path("id/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public Candidate getCandidateById(@PathParam("id") int candidate_id){
		return candidateService.getCandidateById(candidate_id);
	}
	
	@GET
	@Path("city/{city}")
	@Produces(MediaType.APPLICATION_XML)
	public List<Candidate> getCandidateByCity(@PathParam("city") String city){
		return candidateService.getCandidateByCity(city);
	}
	
	@GET
	@Path("standard/{standard}")
	@Produces(MediaType.APPLICATION_XML)
	public List<Marks> getMarksByStandard(@PathParam("standard") String standard){
		return marksService.getMarksByStandard(standard);
	}
	
}
