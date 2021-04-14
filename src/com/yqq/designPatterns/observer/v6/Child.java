package com.yqq.designPatterns.observer.v6;

import java.util.ArrayList;
import java.util.List;

/**
 * 有很多时候，观察者要根据具体情况进行处理
 */
class Child {

    private boolean cry = false;
    private List<Observer> observers = new ArrayList<>();

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

        wakeUpEvent event = new wakeUpEvent(System.currentTimeMillis(), "bed");
        for (Observer observer : observers) {
            observer.actionOnWakeUp(event);
        }
    }


}

interface Observer{
    void actionOnWakeUp(wakeUpEvent event);
}

/**
 * 事件类
 */
class wakeUpEvent{
    long timestamp;
    String loc;

    public wakeUpEvent(long timestamp, String loc) {
        this.timestamp = timestamp;
        this.loc = loc;
    }
}

class Dad implements Observer {
    public void feed() {
        System.out.println("dad feeding...");
    }

    @Override
    public void actionOnWakeUp(wakeUpEvent event) {
        feed();
    }
}

class Mum implements Observer {
    public void hug() {
        System.out.println("mum hugging...");
    }

    @Override
    public void actionOnWakeUp(wakeUpEvent event) {
        hug();
    }
}

class Dog implements Observer {
    public void wang() {
        System.out.println("dog wang...");
    }

    @Override
    public void actionOnWakeUp(wakeUpEvent event) {
        wang();
    }
}

