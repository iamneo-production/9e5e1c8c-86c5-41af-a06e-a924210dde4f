package com.examly.springapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.examly.springapp.models.ComplaintModel;
import com.examly.springapp.service.ComplaintService;
import com.examly.springapp.repository.ComplaintRepository;


@RestController
public class UserComplaintController {

	@Autowired
	private ComplaintService complaintservice;
	@Autowired
	private ComplaintRepository complaintrepository;
	

	public UserComplaintController(ComplaintService complaintservice) {	this.complaintservice = complaintservice;}
	

    @PostMapping("/addComplaint")
	public ResponseEntity<ComplaintModel> addComplaint(@RequestBody ComplaintModel complaint){
		ComplaintModel newcomplaint= complaintservice.addComplaint(complaint);
		return new ResponseEntity<>(newcomplaint,HttpStatus.CREATED);
	}

    @RequestMapping(value="/complaint/{id}")
	public ResponseEntity<List<ComplaintModel>> IssueEditData(@PathVariable String id){
		List<ComplaintModel> complaint=complaintservice.findByComplaintId(id);
		return new ResponseEntity<List<ComplaintModel>>(complaint,HttpStatus.OK);
	}

    @PutMapping("/update")
	public ResponseEntity<ComplaintModel> complaintEditSave(@RequestBody ComplaintModel complaint){
		ComplaintModel updatecomplaint= complaintservice.updateComplaint(complaint);
		return new ResponseEntity<>(updatecomplaint,HttpStatus.CREATED);
	}

    @DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteComplaint(@PathVariable String id) {

         complaintservice.deleteComplaint(id);
		return new ResponseEntity<>(HttpStatus.OK);
    }	
}
