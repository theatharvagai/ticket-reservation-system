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
public class TicketTest {
    
    public TicketTest() {
    }
    @Test
    public void testTicketCreation() {
        Ticket ticket = new Ticket(101, "Chennai", "Bangalore", 2);

        assertEquals(101, ticket.getTicketNo());
    }
}
