package com.yqq.designPatterns.factory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = new MagicFactory();

        Food food = factory.createFood();
        food.printName();

        Vehicle w = factory.createVehicle();
        w.go();

        Weapon weapon = factory.createWeapon();
        weapon.shoot();


    }
}
