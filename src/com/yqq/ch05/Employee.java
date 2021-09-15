package com.yqq.ch05;

import java.util.Date;

/**
 * description:
 * Created by yqq
 * 2021-09-14
 */
public class Employee {

    private String name;

    private float salary;

    private Date hireDay;

    public Employee() {
    }

    public Employee(String name, float salary, Date hireDay) {
        this.name = name;
        this.salary = salary;
        this.hireDay = hireDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }
}
