package com.pluralsight;

public class Hotel {

    //properties that describe a hotel
    private String name;
    private int numberOfRooms;
    private int bookedRooms;

    //this is the constructor that helps us create a hotel
    public Hotel(String name, int numberOfRooms) {
        this.name = name;
        this.numberOfRooms = numberOfRooms;
    }

    public Hotel(){

    }

    public Hotel(String name){
        this.name = name;
        this.numberOfRooms = 50;
    }

    public Hotel(String name, int numberOfRooms, int bookedRooms) {
        this.name = name;
        this.numberOfRooms = numberOfRooms;
        this.bookedRooms = bookedRooms;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getBookedRooms() {
        return bookedRooms;
    }

    public void setBookedRooms(int bookedRooms) {
        this.bookedRooms = bookedRooms;
    }

    //derived getter that is giving information based off a few different properties of the class
    //a calcualation of sorts
    public int getNumOfAvailableRooms() {
        return this.getNumberOfRooms() - this.getBookedRooms();
    }

}
