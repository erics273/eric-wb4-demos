package com.pluralsight;

public class TheApp {

    public static void main(String[] args) {

        //create the hotel myHotel is an instance of the hotel class
        Hotel myHotel = new Hotel("Eric's Awesome Hotel", 27);

        myHotel.setNumberOfRooms(12);

        //display the name of the hotel we just created
        System.out.println(myHotel.getName());

        myHotel.setBookedRooms(3);

        System.out.println(myHotel.getNumOfAvailableRooms()+ " rooms are availble out of " + myHotel.getNumberOfRooms());


        Person thePerson = new Person("Eric", 44);

        System.out.println(thePerson.getName());

        thePerson.setName("Delon");
        System.out.println(thePerson.getName());

        System.out.println(thePerson.getAge());

        thePerson.setName("Jazzy");
        System.out.println(thePerson.getName());

        System.out.println(thePerson.getAge());

        //test our car
        Car potatoCar = new Car("Subaru", "WRX");

        //how fast is this car going
        System.out.println("The cars speed is " + potatoCar.getSpeed() );

        //change the speed of the car
        potatoCar.accelerate(10);

        //how fast is this car going
        System.out.println("The cars speed is " + potatoCar.getSpeed() );

        //change the cars speed
        potatoCar.brake(20);

        //how fast is this car going
        System.out.println("The cars speed is " + potatoCar.getSpeed() );


    }

}
