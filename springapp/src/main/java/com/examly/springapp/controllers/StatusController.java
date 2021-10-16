package com.examly.springapp.controllers;
import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RestController;
	

	import com.examly.springapp.models.StatusModel;
    import com.examly.springapp.service.StatusService;

	@RestController
	public class StatusController{

		@Autowired
		private StatusService statusservice;
		
		public StatusController(StatusService statusservice) {	this.statusservice = statusservice;}
		
		@GetMapping("/openstatus")
		public ResponseEntity<List<StatusModel>> showOpenStatus(){
			List<StatusModel> status=statusservice.showOpenStatus();
			return new ResponseEntity<>(status,HttpStatus.OK);		
		}
		
		@GetMapping("/closedstatus")
		public ResponseEntity<List<StatusModel>> showClosedStatus(){
			List<StatusModel> status=statusservice.showClosedStatus();
			return new ResponseEntity<>(status,HttpStatus.OK);		
		}
		
	}
