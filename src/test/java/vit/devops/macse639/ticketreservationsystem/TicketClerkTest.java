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
public class TicketClerkTest {
    
    @Test
    public void testClerkCreation() {
        TicketClerk c = new TicketClerk("John", "Station A");
        assertNotNull(c);
    }
    
}
