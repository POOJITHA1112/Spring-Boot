package com;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;
import java.util.Optional;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.controller.LabController;
import com.entity.Lab;
//import com.fasterxml.jackson.databind.deser.DataFormatReaders.Match;
import com.service.LabService;

import static org.mockito.BDDMockito.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest(LabController.class)
public class ControllerTest {

	@MockBean
	private LabService labservice;

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testAll() throws Exception {
		Lab lab1 = Lab.builder().id(100).name("lab1").location("hyd").build();
		Lab lab2 = Lab.builder().id(101).name("lab2").location("delhi").build();
		List<Lab> labs = List.of(lab1, lab2);

		when(labservice.findAll()).thenReturn(labs);
		mockMvc.perform(get("/lab")).andExpect(status().isOk()).andExpect(jsonPath("$", Matchers.hasSize(2)))
				.andExpect(jsonPath("$[0].name", Matchers.is("lab1")))
				.andExpect(jsonPath("$[0].location", Matchers.is("hyd")))
				.andExpect(jsonPath("$[1].name", Matchers.is("lab2")))
				.andExpect(jsonPath("$[1].location", Matchers.is("delhi")));
		System.out.println(lab1);
		System.out.println(lab2);

	}

	@Test
	public void testSave() throws Exception {
		// data sending
		Lab labactual = Lab.builder().name("lab3").location("hyd").build();
		// data retrieval
		Lab labGet = Lab.builder().id(1).name("lab3").location("hyd").build();

		when(labservice.save(labactual)).thenReturn(labGet);

		String requestBody = "{\"name\":\"lab3\",\"location\":\"hyd\"}";

		mockMvc.perform(post("/lab").contentType(MediaType.APPLICATION_JSON).content(requestBody))
				.andExpect(status().isOk()).andExpect(jsonPath("$.name", Matchers.is("lab3")))
				.andExpect(jsonPath("$.location", Matchers.is("hyd")));

	}

	@Test
	public void testUpdate() throws Exception {
		Lab lab1 = Lab.builder().id(100).name("lab3").location("hyd").build();
		Lab labTest = Lab.builder().id(100).name("lab3").location("hyd").build();

		when(labservice.update(lab1)).thenReturn(labTest);

		String requestBody = "{\"id\":100,\"name\":\"lab3\",\"location\":\"hyd\"}";

		mockMvc.perform(put("/lab").contentType(MediaType.APPLICATION_JSON).content(requestBody))
				.andExpect(status().isOk()).andExpect(jsonPath("$.name", Matchers.is("lab3")))
				.andExpect(jsonPath("$.location", Matchers.is("hyd")));

	}

	@Test
	public void testDelete() throws Exception {
		long id = 100;
		// will do nothing method is given to methods that has return type as void(JPA
		// Repository)
		willDoNothing().given(labservice).deleteById((int) id);
		mockMvc.perform(delete("/lab/{id}", id));

	}

	@Test
	public void testGetById() throws Exception {
		Lab lab1 = Lab.builder().id(100).name("lab1").location("hyd").build();
		int id = 100;
		given(labservice.findById(id)).willReturn(lab1);
		mockMvc.perform(get("/lab/findById/{id}", id)).andExpect(status().isOk());
	}

	@Test
	public void testGetByName() throws Exception {
		Lab lab1 = Lab.builder().id(100).name("lab1").location("hyd").build();
		String name = "lab1";
		given(labservice.findByName(name)).willReturn(lab1);
		mockMvc.perform(get("/lab/findByName/{name}", name)).andExpect(status().isOk());

	}

	@Test
	public void testGetByLocation() throws Exception {
		Lab lab1 = Lab.builder().id(100).name("lab1").location("hyd").build();
		String location = "hyd";
		given(labservice.findByLocation(location)).willReturn(lab1);
		mockMvc.perform(get("/lab/findByLocation/{location}", location)).andExpect(status().isOk());
	}

	@Test
	public void testGetByNameAndLocation() throws Exception {
		Lab lab1 = Lab.builder().id(100).name("lab1").location("hyd").build();
		String name = "lab1";
		String location = "hyd";
		given(labservice.findByNameAndLocation(name, location)).willReturn(lab1);
		mockMvc.perform(get("/lab/findByNameAndLocation/{name}/{location}", name, location)).andExpect(status().isOk());

	}

}
