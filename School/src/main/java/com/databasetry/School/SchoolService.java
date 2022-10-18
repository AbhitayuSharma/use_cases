package com.databasetry.School;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolService {
	 @Autowired
	    private SchoolRepository schoolRepository;
	    public List<SchoolEntity> list() {
	        return schoolRepository.findAll();
	    }
}
