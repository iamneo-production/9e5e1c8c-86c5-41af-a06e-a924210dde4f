package com.examly.springapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="status")
public class StatusModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String statusId; 
	private String status;
	private String statusDesc;
	
	public StatusModel() {}
	
	public StatusModel(int id, String statusId, String status, String statusDesc) {
		super();
		this.id = id;
		this.statusId = statusId;
		this.status = status;
		this.statusDesc = statusDesc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatusId() {
		return statusId;
	}

	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusDesc() {
		return statusDesc;
	}

	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}
	
	
	
	/* statusId: String
     * status: String
     * statusDesc: Desc
	*/

}
