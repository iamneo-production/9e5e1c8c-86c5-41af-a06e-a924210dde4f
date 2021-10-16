package com.examly.springapp.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import com.example.demo.StatusModel;
import com.example.demo.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
@Transactional
public class StatusService {
	
	@Autowired
	private StatusRepository statusrepository;
	
	@Autowired
	public StatusService(StatusRepository statusrepository) {
		this.statusrepository = statusrepository;
	}
	
	private List<StatusModel> openStatus;
	private List<StatusModel> closedStatus;

	public List<StatusModel> showOpenStatus() {
		List<StatusModel> list=statusrepository.findAll();
		for(StatusModel  s:list) {
			if(s.getStatus()=="open")
			{
				openStatus.add(s);
			}
		}
		return openStatus;
	}
	public List<StatusModel> showClosedStatus() {
		List<StatusModel> list=statusrepository.findAll();
		for(StatusModel s:list) {
			if(s.getStatus()=="closed")
			{
				closedStatus.add(s);
			}
		}
		return closedStatus;
	}
		
}
	
    

