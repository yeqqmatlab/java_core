package com.yqq.designPatterns.observer.v5;

import java.util.ArrayList;
import java.util.List;

public class Child {

    private boolean cry = false;
    private List<Observer>  observers = new ArrayList<>();

    {
        observers.add(new Dad());
        observers.add(new Mum());
        observers.add(new Dog());
    }

    public boolean isCry(){
        return cry;
    }

    public void wakeUp(){
        cry = true;
        for (Observer observer : observers) {
            observer.actionOnWakeUp();
        }
    }




}

interface Observer{
    void actionOnWakeUp();
}

class Dad implements Observer{

    public void feed(){
        System.out.println("dad feed...");
    }

    @Override
    public void actionOnWakeUp() {
        feed();
    }
}

class Mum implements Observer{

    public void hug(){
        System.out.println("mum hugging ... ");
    }

    @Override
    public void actionOnWakeUp() {
        hug();
    }
}

class Dog implements Observer{
    public void wang(){
        System.out.println("dog wang ....");
    }

    @Override
    public void actionOnWakeUp() {
        wang();
    }
}


