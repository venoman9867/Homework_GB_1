package com.GeekBrains;

public class Human implements Runnable, Jumble {
    private final String name;
    private final double jump;
    private final int run;

    public Human(String name, double jump, int run) {
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
