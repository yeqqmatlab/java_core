package com.yqq.designPatterns.factory;

/**
 * 抽象工厂
 */
public abstract class AbstractFactory {

    abstract Food createFood();

    abstract Vehicle createVehicle();

    abstract Weapon createWeapon();

}
