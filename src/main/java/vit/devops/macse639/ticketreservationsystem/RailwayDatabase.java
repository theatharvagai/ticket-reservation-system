/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vit.devops.macse639.ticketreservationsystem;

/**
 *
 * @author atharva
 */
public class RailwayDatabase {
    private int id;
    private String response;

    public RailwayDatabase(int id, String response) {
        this.id = id;
        this.response = response;
    }

    public void showData() {
        System.out.println("Database ID: " + id + ", Response: " + response);
    }
}