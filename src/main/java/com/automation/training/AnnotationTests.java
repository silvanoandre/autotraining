package com.automation.training;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AnnotationTests {

    @Test
	public void testConcact() {
		String a = "I love ";
		String b = "test automation";
		String resultado = a + b;		
        Assert.assertEquals(resultado, "I love test automation");
	}
  
}