package com.GeekBrains;

import java.util.Random;

public class Treadmill implements Obstacles{
    private final int length;

    public Treadmill(int length) {
        this.length=length;
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

    public void accept(Runnable runnable) {
         {
            runnable.run(length);
        }
    }
}
