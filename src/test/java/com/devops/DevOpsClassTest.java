package com.devops;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class DevOpsClassTest {

	@Test
    public void testGetMessage() {
        DevOpsClass app = new DevOpsClass();
        assertEquals("Bonjour DevOps c'est la branche Dev , J'attends GitHub Action ;)", app.getMessage());
    }
    
    @Test
    public void testApp() {
        assertTrue(true);
    }
	
	
}
