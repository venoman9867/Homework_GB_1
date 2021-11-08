package com.GeekBrains;

import java.util.Random;

public class Treadmill {
    private final int i;

    public Treadmill(int i) {
        this.i=i;
    }

    public void randomResult() {
        Random random = new Random();
        boolean result;
        result=random.nextBoolean();
        if(result=true){
            System.out.println("Участник пробежал");
        }else{
            System.out.println("Участник не смог пробежать");
        }
    }
}
