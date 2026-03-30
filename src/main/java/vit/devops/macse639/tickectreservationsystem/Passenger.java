/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vit.devops.macse639.tickectreservationsystem;

/**
 *
 * @author rahul
 */
public class Passenger {
    private String name;
    private int age;
    private String address;

    public Passenger(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void searchTrains() {
        System.out.println("Searching available trains...");
    }

    public void viewSchedule() {
        System.out.println("Viewing train schedule...");
    }

    public Ticket reserveSeat(String start, String destination) {
        System.out.println("Seat reserved from " + start + " to " + destination);
        return new Ticket(101, start, destination, 1);
    }

    public void purchaseTicket(Ticket ticket) {
        System.out.println("Ticket purchased: " + ticket.getTicketNo());
    }

    public void cancelTicket(Ticket ticket) {
        System.out.println("Ticket cancelled: " + ticket.getTicketNo());
    }

    public void makePayment(Payment payment) {
        payment.processPayment();
    }
}
