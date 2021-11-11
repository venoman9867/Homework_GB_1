package com.GeekBrains;

public class Human implements Runnable, Jumble {
    private final String name;
    private final double maxJump;
    private final int maxRun;
    private boolean isStopped = false;

    public Human(String name, double jump, int run) {
        this.name = name;
        this.maxJump = jump;
        this.maxRun = run;
    }

    @Override
    public boolean jump(double height) {
        if (height <= maxJump) {
            System.out.println("Человек "+name + " Перепрыгнул");
            return true;
        } else {
            System.out.println("Человек "+name+" не смог перепрыгнуть");
            isStopped=true;
        }
        return false;
    }

    @Override
    public boolean run(int length) {
        if (length<=maxRun){
            System.out.println("Человек "+name+" Пробежал");
            return true;
        }else{
            System.out.println("Человек "+name+" не мог пробежать");
            isStopped=true;
            return false;
        }
    }


    @Override
    public boolean isStopped() {
        return isStopped;
    }
}
