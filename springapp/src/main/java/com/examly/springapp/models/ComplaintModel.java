package com.examly.springapp.models;

import java.sql.Date;

public class ComplaintModel {

	private int id;
	private String complaintId;
	private Date createdOn;
	private UserModel createdBy;
	private UserModel resolveBy;
	private StatusModel status;
	
	public ComplaintModel() {
		super();
	}
	
	public ComplaintModel(int id, String complaintId, Date createdOn, UserModel createdBy, UserModel resolveBy,
			StatusModel status) {
		super();
		this.id = id;
		this.complaintId = complaintId;
		this.createdOn = createdOn;
		this.createdBy = createdBy;
		this.resolveBy = resolveBy;
		this.status = status;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getComplaintId() {
		return complaintId;
	}
	public void setComplaintId(String complaintId) {
		this.complaintId = complaintId;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public UserModel getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(UserModel createdBy) {
		this.createdBy = createdBy;
	}
	public UserModel getResolveBy() {
		return resolveBy;
	}
	public void setResolveBy(UserModel resolveBy) {
		this.resolveBy = resolveBy;
	}
	public StatusModel getStatus() {
		return status;
	}
	public void setStatus(StatusModel status) {
		this.status = status;
	}
	
	
	
	
	
}
