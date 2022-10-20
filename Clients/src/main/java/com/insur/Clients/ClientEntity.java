package com.insur.Clients;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class ClientEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int client_id;
	private String client_name;
	private String Insurance_type;
	private int term_plan;
	public int getClient_id() {
		return client_id;
	}
	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}
	public String getClient_name() {
		return client_name;
	}
	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}
	public String getInsurance_type() {
		return Insurance_type;
	}
	public void setInsurance_type(String insurance_type) {
		Insurance_type = insurance_type;
	}
	public int getTerm_plan() {
		return term_plan;
	}
	public void setTerm_plan(int term_plan) {
		this.term_plan = term_plan;
	}
	
}
