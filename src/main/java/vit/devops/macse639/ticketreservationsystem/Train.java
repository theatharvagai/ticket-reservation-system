/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vit.devops.macse639.ticketreservationsystem;

/**
 *
 * @author atharva
 */
public class Train {
    private String model;
    private int trainId;

    public Train(String model, int trainId) {
        this.model = model;
        this.trainId = trainId;
    }

    public void displayTrain() {
        System.out.println("Train ID: " + trainId + ", Model: " + model);
    }
}
