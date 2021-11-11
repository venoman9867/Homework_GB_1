package com.GeekBrains;

import java.util.Random;

public class Wall implements Obstacles{
    private final double height;

    public Wall(double height) {
        this.height=height;
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

    public void accept(Jumble jumble) {
        jumble.jump(height);
    }
}

