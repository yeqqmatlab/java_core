package com.yqq.designPatterns.iterator.v1;

/**
 * 模拟 jdk ArrayList
 */
public class Main {
    public static void main(String[] args) {

        ArrayList_ list = new ArrayList_();
        for (int i = 0; i < 15; i++) {
            list.add(new String("s"+i));
        }
        System.out.println(list.size());
        for (int i = 0; i < 15; i++) {
            System.out.println(list.get(i));
        }

    }
}

class ArrayList_{
    Object[] objects = new Object[10];

    private int index = 0;

    public Object get(int index){
        return objects[index];
    }

    public void add(Object o){
        if (index == objects.length) {
            Object[] newObjects = new Object[objects.length*2];
            System.arraycopy(objects,0,newObjects,0,objects.length);
            objects = newObjects;
        }
        objects[index] = o;
        index++;
    }

    public int size(){
        return index;
    }


}
