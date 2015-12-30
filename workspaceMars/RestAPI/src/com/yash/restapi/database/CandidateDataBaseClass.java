package com.yash.restapi.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yash.restapi.model.Candidate;
import com.yash.restapi.model.Marks;
import com.yash.restapi.util.ConnectionProvider;

public class CandidateDataBaseClass {
	
	
	
	public Candidate getCandidateById(int candidate_id) {
		Connection connection = ConnectionProvider.getConnection();
		PreparedStatement preparedstatement;
		try {
			String query="SELECT * FROM CANDIDATE WHERE CANDIDATE_ID=?";
			preparedstatement=connection.prepareStatement(query);
			preparedstatement.setInt(1, candidate_id);
			preparedstatement.execute();
			ResultSet resultSet=preparedstatement.executeQuery();
			while(resultSet.next()){
				Candidate candidate = new Candidate();
				String name = resultSet.getString("name");
				String city = resultSet.getString("city");
				int id= resultSet.getInt("candidate_id");
				candidate.setCandidate_id(id);
				candidate.setName(name);
				candidate.setCity(city);
				return candidate;
								
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	public List<Candidate> getCandidateByCity(String city){
		String query= "SELECT * FROM CANDIDATE WHERE CITY=?";
		Connection connection=ConnectionProvider.getConnection();
		PreparedStatement preparedstatement;
		ArrayList<Candidate> arrayList= new ArrayList<>();
		try {
			preparedstatement= connection.prepareStatement(query);
			preparedstatement.setString(1, city);
			preparedstatement.execute();
			ResultSet resultSet=preparedstatement.executeQuery();
			while(resultSet.next()){
				Candidate candidate = new Candidate();
				String dbName = resultSet.getString("name");
				String dbCity = resultSet.getString("city");
				int dbId= resultSet.getInt("candidate_id");
				candidate.setCandidate_id(dbId);
				candidate.setName(dbName);
				candidate.setCity(dbCity);
				arrayList.add(candidate);
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arrayList;
		
	}

	
	public List<Candidate> getAllCandidates() {
		String query = "SELECT * FROM CANDIDATE";
		Connection connection = ConnectionProvider.getConnection();
		PreparedStatement preparedstatement;
		ArrayList<Candidate> arrayList = new ArrayList<>();
		try {
			preparedstatement = connection.prepareStatement(query);
			preparedstatement.execute();
			ResultSet resultSet = preparedstatement.executeQuery();
			while (resultSet.next()) {
				Candidate candidate = new Candidate();
				int dbId = resultSet.getInt("candidate_id");
				String dbName = resultSet.getString("name");
				String dbCity = resultSet.getString("city");
				candidate.setCandidate_id(dbId);
				candidate.setName(dbName);
				candidate.setCity(dbCity);
				arrayList.add(candidate);
				
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		
		return arrayList;

	}

	
	public List<Marks> getMarksByStandard(String standard) {
		String query= "SELECT * FROM MARKS WHERE STANDARD=?";
		Connection connection=ConnectionProvider.getConnection();
		PreparedStatement preparedstatement;
		ArrayList<Marks> arrayList= new ArrayList<>(); 
		try {
			preparedstatement= connection.prepareStatement(query);
			preparedstatement.setString(1, standard);
			preparedstatement.execute();
			ResultSet resultSet=preparedstatement.executeQuery();
			while(resultSet.next()){
				Marks marks= new Marks();
				int dbMarksId = resultSet.getInt("marks_id");
				int dbCandidate_id = resultSet.getInt("candidate_id");
				String dbStandard= resultSet.getString("standard");
				int dbTotalMarks= resultSet.getInt("totalMarks");
				marks.setMarks_id(dbMarksId);
				marks.setCandidate_id(dbCandidate_id);
				marks.setStandard(dbStandard);
				marks.setTotalMarks(dbTotalMarks);
				arrayList.add(marks);
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arrayList;
	}

}