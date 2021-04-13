package com.yqq.designPatterns.facadePattern;

//门面角色
public class Facade {
    private SubSystem01 ob1 = new SubSystem01();
    private SubSystem02 ob2 = new SubSystem02();
    private SubSystem03 ob3 = new SubSystem03();

    public void method(){
        ob1.method1();
        ob2.method2();
        ob3.method3();
    }
}
