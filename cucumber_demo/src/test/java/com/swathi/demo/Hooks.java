package com.swathi.demo;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    @Before
    public void init()
    {
    	//do some work before test
    	System.out.println("before hook invoked");
    }
    @After
    public void cleanup()
    {
    	//do some work before test
    	System.out.println("after hook invoked");
    }
}
