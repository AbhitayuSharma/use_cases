package com.assignment.vehicle;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	@Autowired
	private TruckRepo tr;
	@Autowired
	private CarRepo cr;
	@Autowired
	private BikeRepo br;
	@GetMapping("/truck")
	public List<TruckEntity> joincol(){
		return tr.getjoin();
	}
	@GetMapping("/car")
	public List<CarEntity> joinco(){
		return cr.getjoin2();
	}
	@GetMapping("/bike")
	public List<BikeEntity> joinbike(){
		return br.getjoinbike();
	}
	
}
