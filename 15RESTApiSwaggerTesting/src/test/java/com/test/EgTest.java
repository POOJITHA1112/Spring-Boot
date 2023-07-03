package com.test;

import static org.hamcrest.CoreMatchers.equalTo;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.testclass.TestClassEg;

public class EgTest {

	@Test
	public void istrue() {
		assertThat(TestClassEg.isTrue(), is(true));

	}

	@Test
	public void isFalse() {
		assertThat(TestClassEg.isFalse(), is(false));
	}

	@Test
	public void isNull() {
		assertThat(TestClassEg.isNull(), nullValue());
	}
	
	@Test
	public void isnotNull() {
		assertThat(TestClassEg.isNotNul(), notNullValue());
	}
	
	@Test
	@Disabled
	public void NumberssAreEqual() {
		int actual=10;
		int expected=20;
		assertThat(actual, equalTo(expected));
	}
	
	@Test
	public void twoArraysEqual() {
		int []a1= {1,3,5};
		int []a2= {1,3,5};
		assertThat(a1, equalTo(a2));
	}
	
	
	
	@Test
	public void NumberssAreNotEqual() {
		int actual=10;
		int expected=20;
		assertThat(actual, not(expected));
	}
	
	@Test
	public void twoObjSameRef() {
		Object actual=new Object();
//		Object expected=new Object();
		Object expected=actual;
		assertThat(actual, sameInstance(expected));
		
	}
	
	@Test
	public void twoObjNotSameRef() {
		Object actual=new Object();
		Object expected=new Object();
//		Object expected=actual;
		assertThat(actual, not(sameInstance(expected)));
		
	}
	
	Object []a= {1,2,"pooja",'a'};
	List<Object>a1=Arrays.asList(a);
	public void size() {
		
	}
	
	
}
