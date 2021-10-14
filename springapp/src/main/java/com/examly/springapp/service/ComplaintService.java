package com.examly.springapp.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import com.examly.springapp.models.ComplaintModel;
import com.examly.springapp.models.UserModel;
import com.examly.springapp.repository.ComplaintRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
@Transactional
public class ComplaintService {
	
	@Autowired
	private ComplaintRepository complaintrepository;
	
	@Autowired
	public ComplaintService(ComplaintRepository complaintrepository) {
		this.complaintrepository = complaintrepository;
	}
	
	public ComplaintModel addComplaint(ComplaintModel complaint) {
		return complaintrepository.save(complaint);
	}

	public List<ComplaintModel> findAllComplaints() {
		return complaintrepository.findAll();
	}
	
	public ComplaintModel findComplaintById(Long id) {
        try {
			return complaintrepository.findComplaintById(id)
			        .orElseThrow(() -> new Exception("User by id " + id + " was not found"));
		} catch (Exception e) {
			e.printStackTrace();
		}
        return null;
    }

	public ComplaintModel updateComplaint(ComplaintModel complaint) {
		return complaintrepository.save(complaint);
	}

	public void deleteComplaint(Long id) {
		complaintrepository.deleteComplaintById(id);
	}
	
}
