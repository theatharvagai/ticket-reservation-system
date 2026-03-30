/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package vit.devops.macse639.ticketreservationsystem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author atharva
 */
public class PassengerTest {
    
   @Test
    public void testPassengerCreation() {
        Passenger p = new Passenger("Rahul", 21, "Chennai");

        assertEquals("Rahul", p.getName());
        assertEquals(21, p.getAge());
    }

    @Test
    public void testPassengerNotNull() {
        Passenger p = new Passenger("Test", 30, "India");
        assertNotNull(p);
    }
    
}
