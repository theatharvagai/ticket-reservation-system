/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vit.devops.macse639.tickectreservationsystem;

/**
 *
 * @author rahul
 */
public class TickectReservationSystem {

    public static void main(String[] args) {
        Passenger p = new Passenger("Rahul", 21, "Chennai");

        p.searchTrains();
        p.viewSchedule();

        Ticket t = p.reserveSeat("Chennai", "Bangalore");

        Payment payment = new Payment(500);
        p.makePayment(payment);

        p.purchaseTicket(t);

        
    }
}
