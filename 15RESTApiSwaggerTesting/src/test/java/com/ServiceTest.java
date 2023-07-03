package com;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


import java.util.Arrays;
import java.util.List;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.hamcrest.collection.IsCollectionWithSize;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.entity.Lab;
import com.repository.LabRepository;
import com.service.LabService;
import com.service.ServiceImpl;

@ExtendWith(MockitoExtension.class)
public class ServiceTest {

	@Mock
	private LabRepository labRepository;

	@InjectMocks
	private ServiceImpl serviceImpl;

	@Test
	public void findAllTest() {
		Lab l1 = Lab.builder().name("LAB_HYD1").location("HYD").build();
		Lab l2 = Lab.builder().name("LAB_HYD2").location("HYD").build();
		List<Lab> labs = Arrays.asList(l1, l2);
		when(labRepository.findAll()).thenReturn(labs);
		List<Lab> allLabs = labRepository.findAll();
		assertThat(allLabs,IsCollectionWithSize.hasSize(2));
		
		Matcher<Iterable<? super Lab>>hasLabNameHyd1=Matchers.hasItem(Matchers.hasProperty("name",Matchers.equalTo("LAB_HYD1")));
		assertThat(allLabs,hasLabNameHyd1);
	}
	 
	@Test
	public void saveTest() {
		Lab l1 = Lab.builder().name("LAB_HYD1").location("HYD").build();
		Lab l2 = Lab.builder().id(100).name("LAB_HYD2").location("HYD").build();
		
		when(labRepository.save(l1)).thenReturn(l2);
		assertThat(serviceImpl.save(l1), Matchers.hasProperty("id",Matchers.equalTo(100)));
		verify(labRepository,times(1)).save(l1);
	}
	
	@Test
	public void updateTest() {
		Lab l1 = Lab.builder().id(100).name("LAB_HYD1").location("HYD").build();
		Lab l2 = Lab.builder().id(100).name("LAB_HYD1").location("HYD").build();
		
		when(labRepository.save(l1)).thenReturn(l2);
		serviceImpl.update(l1);
		assertThat(l1, is(l2));
		
		
		
	}
	 

}
