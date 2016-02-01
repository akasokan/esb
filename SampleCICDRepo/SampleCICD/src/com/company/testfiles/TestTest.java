package com.company.testfiles;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sun.net.httpserver.Authenticator.Success;

import junit.framework.TestCase;

public class TestTest  extends TestCase{

	@Test
	public void testMain() {
		 Sample t = new Sample();
		  assertTrue(t.testFunction(1));
	}

}
