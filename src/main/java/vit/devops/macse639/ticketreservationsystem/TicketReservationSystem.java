/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vit.devops.macse639.ticketreservationsystem;

/**
 *
 * @author rahul
 */
public class TicketReservationSystem {

    public static void main(String[] args) {
        Passenger p = new Passenger("Rahul", 21, "Chennai");

        p.searchTrains();
        p.viewSchedule();

        Ticket t = p.reserveSeat("Chennai", "Bangalore");

        Payment payment = new Payment(500);
        p.makePayment(payment);

        p.purchaseTicket(t);
        Train train = new Train("Express", 123);
        train.displayTrain();

        TicketClerk clerk = new TicketClerk("John", "Station A");
        clerk.reserveTicket();

        RailwayDatabase db = new RailwayDatabase(1, "Success");
        db.showData();
        
    }
}
