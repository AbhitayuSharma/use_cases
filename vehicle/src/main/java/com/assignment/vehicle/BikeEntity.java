package com.assignment.vehicle;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bike")
public class BikeEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bikeid;
	private String bike_name;
	private int nooftyres;
	public int getBikeid() {
		return bikeid;
	}
	public void setBikeid(int bikeid) {
		this.bikeid = bikeid;
	}
	public String getBike_name() {
		return bike_name;
	}
	public void setBike_name(String bike_name) {
		this.bike_name = bike_name;
	}
	public int getNooftyres() {
		return nooftyres;
	}
	public void setNooftyres(int nooftyres) {
		this.nooftyres = nooftyres;
	}
}
