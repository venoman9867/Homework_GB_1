package com.GeekBrains;

public class Main {

    public static void main(String[] args) {
        Participant[] participants=new Participant[]{
        new Cat("Boris",0.3,50),
        new Robot("T-3000",3.5,4000),
        new Human("Marusya Filatova",0.6,2000),
        new Cat("Liza",1.1,100),
        new Robot("XJ-29",2.0,2500),
        new Human("Oleg Proskurin", 0.5,1500)};
        Obstacles[] obstacles=new Obstacles[]{
             new Treadmill(100),
             new Wall(0.5),
             new Treadmill(500),
             new Wall(1.0),
             new Treadmill(1000),
             new Wall(1.5)
        };
        for (Obstacles obstacle:obstacles){
            for(Participant participant: participants){
                if(!participant.isStopped()){
                    if(obstacle instanceof Wall) {
                        ((Wall) obstacle).accept((Jumble) participant);
                    }else if(obstacle instanceof Treadmill){
                        ((Treadmill)obstacle).accept((Runnable)participant);
                    }
                    }
                }
            }
        }

    }
