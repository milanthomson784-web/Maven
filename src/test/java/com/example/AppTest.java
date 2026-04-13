package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    
    @Test
    public void testEligibility() {
        App app = new App();
        app.addSubject("Math", 10);
        app.addSubject("Science", 6);
        
        // Total 16 should be eligible (Threshold: 15)
        assertEquals(16, app.getTotalCredits());
        assertTrue(app.isEligible());
    }

    @Test
    public void testNotEligible() {
        App app = new App();
        app.addSubject("History", 5);
        
        // Total 5 should not be eligible
        assertFalse(app.isEligible());
    }
}
