package com.suite;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import com.junittest.CalculatorTest;
import com.junittest.CalculatorTest2;
import com.junittest.CalculatorTest3;

@Suite
@SelectClasses({CalculatorTest.class,CalculatorTest2.class,CalculatorTest3.class})
public class SuiteTest {
	
	

}
