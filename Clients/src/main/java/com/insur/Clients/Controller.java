package com.insur.Clients;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	private ClientRepo cr;
	 
	@GetMapping("/clients")
	public List<ClientEntity> joinclient(){
		return cr.getjoin(2);
	}
}
