package com;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hamcrest.collection.IsCollectionWithSize;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.controller.LabController;
import com.entity.Lab;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


@SpringBootTest
public class IntegrationTest {

	@Autowired
	private LabController labController;

	@Test
	public void saveUpdateRetrieveDelete() {
	Lab l1 = Lab.builder().name("Lab1").location("hyd").build();
	Lab l2 = Lab.builder().name("lab2").location("hyd").build();
 
	labController.save(l1);
	labController.save(l2);
	
	List<Lab> labs = labController.findAll();
	assertThat(labs,IsCollectionWithSize.hasSize(2));
	
	
	Lab lab=labs.get(0);
	lab.setName("lab1-updated");
	int labId = lab.getId(); 
	labController.update(lab);
	Lab labUpdated = labController.findById(labId);
	assertThat(lab,is(labUpdated));
	labController.deleteById(labId);
	labController.deleteById(labs.get(1).getId());
	
	
	}	
}
