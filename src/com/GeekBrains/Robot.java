package com.GeekBrains;

public class Robot implements Runnable, Jumble {
    private final int run;
    private final double jump;
    private final String name;

    public Robot(String name, double jump, int run) {
        this.name=name;
        this.jump=jump;
        this.run=run;
    }

    @Override
    public void jump() {
        System.out.println("Прыгнул");
    }

    @Override
    public void run() {
        System.out.println("Пробежал");
    }
}
