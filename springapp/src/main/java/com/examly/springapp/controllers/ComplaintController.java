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

import com.examly.springapp.models.ComplaintModel;
import com.examly.springapp.service.ComplaintService;

@RestController
public class ComplaintController {

	@Autowired
	private ComplaintService complaintservice;
	
	public ComplaintController(ComplaintService complaintservice) {	this.complaintservice = complaintservice;}
	
	@GetMapping("/all")
	public ResponseEntity<List<ComplaintModel>> getComplaints(){
		List<ComplaintModel> complaint=complaintservice.findAllComplaints();
		return new ResponseEntity<>(complaint,HttpStatus.OK);		
	}
	
	@PostMapping("/add")
	public ResponseEntity<ComplaintModel> addComplaint(@RequestBody ComplaintModel complaint){
		ComplaintModel newcomplaint= complaintservice.addComplaint(complaint);
		return new ResponseEntity<>(newcomplaint,HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<ComplaintModel> updateComplaint(@RequestBody ComplaintModel complaint){
		ComplaintModel updatecomplaint= complaintservice.updateComplaint(complaint);
		return new ResponseEntity<>(updatecomplaint,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteComplaint(@PathVariable("id") Long id){
		complaintservice.deleteComplaint(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}	
}
