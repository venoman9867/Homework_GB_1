package com.GeekBrains;

public class Main {

    public static void main(String[] args) {
        Object[] participants=new Object[6];
        participants[1]=new Cat("Boris",0.3,50);
        participants[2]=new Robot("T-3000",3.5,4000);
        participants[3]=new Human("Marusya Filatova",0.6,2000);
        participants[4]=new Cat("Liza",1.1,100);
        participants[5]=new Robot("XJ-29",2.0,2500);
        participants[6]=new Human("Oleg Proskurin", 0.5,1500);
        Object[] obstacles=new Object[6];
        //единица измерения метры
        obstacles[1]=new Treadmill(100);
        obstacles[2]=new Wall(0.5);
        obstacles[3]=new Treadmill(500);
        obstacles[4]=new Wall(1.0);
        obstacles[5]=new Treadmill(1000);
        obstacles[6]=new Wall(1.5);
        
    }
}
