package com;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.service.LabService;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest
class ApplicationTests {

	@Autowired
	LabService lab;
	
//	@Test
//	void contextLoads() {
//	assertThat(lab, notNullValue());
//	}

}
