package com.examly.springapp.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "complaint")
public class ComplaintModel  {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private int id;
	private String complaintId;
	private Date createdOn;
	@ManyToOne()
	private UserModel createdBy;
	@ManyToOne()
	private UserModel resolveBy;
	@ManyToOne()
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


	
	@Override
	public String toString() {
		return "ComplaintModel [id=" + id + ", complaintId=" + complaintId + ", createdOn=" + createdOn + ", createdBy="
				+ createdBy + ", resolveBy=" + resolveBy + ", status=" + status + "]";
	}	
	
		
}
