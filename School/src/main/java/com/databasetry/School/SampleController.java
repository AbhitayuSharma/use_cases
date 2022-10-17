package com.databasetry.School;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SampleController {
	@Autowired
	private SchoolRepo sc;
	
	@GetMapping("/school")
	public List<SchoolEntity> getSample(){
		ArrayList<SchoolEntity> values = new ArrayList<SchoolEntity>();
		for(SchoolEntity smt: sc.findAll()) {
			SchoolEntity temp = new SchoolEntity();
			temp.setId(smt.getId());

			temp.setSchool_name(smt.getSchool_name());
			if(smt.getSchool_name().contains("#")) {
				temp.setSchool_name(smt.getSchool_name().replaceAll("\\#",""));
			}
			values.add(temp);
		}
		return values;
	}
}
