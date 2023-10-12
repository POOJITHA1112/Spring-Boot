package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.entity.CountryRequest;
import com.entity.Lab;

@Service
public class ServiceConsumer {

	@Autowired
	private RestTemplate restTemplate;

	public String findAll() {

		String response = restTemplate.getForObject("http://localhost:8080/lab", String.class);
		System.out.println(response);
		return response;

	}

	public Lab save() {
		String url = "http://localhost:8080/lab";
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);

		Lab l = new Lab();
		l.setName("pooji");
		l.setLocation("hyd");
		HttpEntity<Lab> requestEntity = new HttpEntity<>(l, httpHeaders);
		ResponseEntity<Lab> response = restTemplate.exchange(url, HttpMethod.POST, requestEntity,Lab.class);
		return response.getBody();
	}
	
	
	
//	public String getById(int id) {
//		String url = "http://localhost:8080/lab/findById/{id}";
//		HttpHeaders httpHeaders = new HttpHeaders();
//		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
//
//		Lab l = new Lab();
//		HttpEntity<Lab> requestEntity = new HttpEntity<>(l, httpHeaders);
//		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET , requestEntity, String.class,id);
//		return response.getBody();
//	}
//	
//        public String findAllCitiesNyCountry(String country) {
//		
//		HttpHeaders headers = new HttpHeaders();
//		headers.setContentType(MediaType.APPLICATION_JSON);
//		
//		CountryRequest cr = new CountryRequest(country);
//		
//		HttpEntity<CountryRequest> requestEntity = new HttpEntity<>(cr, headers);
//		
//		String url = "http://localhost:8080/lab/findByName/{name}";
//		ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class);
//		
//		return responseEntity.getBody();
//	}
//        
//        public String getByName(String name) {
//    		String url = "http://localhost:8080/lab/findByName/{name}";
//    		HttpHeaders httpHeaders = new HttpHeaders();
//    		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
//
//    		Lab l = new Lab();
//    		HttpEntity<Lab> requestEntity = new HttpEntity<>(l, httpHeaders);
//    		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET , requestEntity, String.class,name);
//    		return response.getBody();
//    	}  
//        
//        public String delete(int id) {
//    		String url = "http://localhost:8080/lab/{id}";
//    		HttpHeaders httpHeaders = new HttpHeaders();
//    		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
//
//    		Lab l = new Lab();
//    		HttpEntity<Lab> requestEntity = new HttpEntity<>(l, httpHeaders);
//    		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.DELETE , requestEntity, String.class,id);
//    		return response.getBody();
//    	}  
//        
        
        

}
