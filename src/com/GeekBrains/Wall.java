package com.GeekBrains;

import java.util.Random;

public class Wall {
    private final double i;

    public Wall(double i) {
        this.i=i;
    }

    public void randomResult() {
        Random random = new Random();
        boolean result;
        result = random.nextBoolean();
        if(result=true){
            System.out.println("Участник смог перепрыгнуть");
        }else{
            System.out.println("Участник не смог перепрыгнуть");
        }
    }
}

