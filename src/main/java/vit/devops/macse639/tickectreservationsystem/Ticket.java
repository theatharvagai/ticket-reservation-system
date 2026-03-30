/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vit.devops.macse639.tickectreservationsystem;

/**
 *
 * @author rahul
 */
public class Ticket {
    private int ticketNo;
    private String startingLocation;
    private String destinationLocation;
    private int passengerNo;

    public Ticket(int ticketNo, String start, String dest, int passengerNo) {
        this.ticketNo = ticketNo;
        this.startingLocation = start;
        this.destinationLocation = dest;
        this.passengerNo = passengerNo;
    }

    public int getTicketNo() {
        return ticketNo;
    }

    public void paymentAmount() {
        System.out.println("Payment amount calculated.");
    }

    public void cancelTicket() {
        System.out.println("Ticket cancelled successfully.");
    }
}
