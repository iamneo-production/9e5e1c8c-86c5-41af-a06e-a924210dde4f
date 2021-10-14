package com.examly.springapp.service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import com.examly.springapp.models.ComplaintModel;
import com.examly.springapp.models.UserModel;
import com.examly.springapp.repository.ComplaintRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

@Service
@Transactional
public class ComplaintService {
	
	@Autowired
	private ComplaintRepository complaintrepository;
	
	@Autowired
	public ComplaintService(ComplaintRepository complaintrepository) {
		this.complaintrepository = complaintrepository;
	}
	
	/*public List<ComplaintModel> getIssue(){
		System.out.println("Issue is ----------------->"+complaintrepository.findAll());
		LOGGER.info("Simple log statement with inputs {}, {} and {}", 1,2,3);
		return (List<ComplaintModel>) complaintrepository.findAll();
	}*/
	public ComplaintModel addComplaint(ComplaintModel complaint) {
		return complaintrepository.save(complaint);
	}

	public List<ComplaintModel> findAllComplaints() {
		return complaintrepository.findAll();
	}

	public ComplaintModel updateComplaint(ComplaintModel complaint) {
		return complaintrepository.save(complaint);
	}

	public void deleteComplaint(Long id) {
		complaintrepository.deleteComplaintById(id);
	}
	
	

	
}