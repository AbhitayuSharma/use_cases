package com.assignment.vehicle;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "truck")
public class TruckEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int truckid;
	private String truck_name;
	private int nooftyres;
	public int getTruckid() {
		return truckid;
	}
	public void setTruckid(int truckid) {
		this.truckid = truckid;
	}
	public String getTruck_name() {
		return truck_name;
	}
	public void setTruck_name(String truck_name) {
		this.truck_name = truck_name;
	}
	public int getNooftyres() {
		return nooftyres;
	}
	public void setNooftyres(int nooftyres) {
		this.nooftyres = nooftyres;
	}
}
