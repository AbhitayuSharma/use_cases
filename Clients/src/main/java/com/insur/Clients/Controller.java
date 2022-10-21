package com.insur.Clients;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	private ClientRepo cr;
	 
	@GetMapping("/clients/{id}")
	public List<ClientEntity> joinclient(@PathVariable int id){
		return cr.getjoin(id);
	}
	
	
	final String more = "morethanfive";
	final String less = "lessthanfive";
	final String equal = "equalfive";
	final int percentage=100;
	int discount=0;
	@GetMapping("/client_discount/{tenure}/{premium}")
	public int discount(@PathVariable String tenure, @PathVariable int premium) {
	
		
		if(tenure.equals(less)) {
			return premium;
		}
		if(tenure.equals(equal)) {
			discount = 10*premium/percentage;
		}
		else if(tenure.equals(more)){
			discount =12*premium/percentage;
		}
		return premium-discount;
	}
}
