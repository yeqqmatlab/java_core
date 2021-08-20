package com.yqq.thread.ch02.p120;

public class PrintString implements Runnable{
    private boolean isContinuePrint = true;

    public boolean isContinuePrint(){
        return isContinuePrint;
    }

    public void setContinuePrint(boolean flag){
        this.isContinuePrint = flag;
    }
    public void printStringMethod(){
        try {
            while (isContinuePrint == true) {
                System.out.println("run thread ---> " + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        printStringMethod();
    }
}
