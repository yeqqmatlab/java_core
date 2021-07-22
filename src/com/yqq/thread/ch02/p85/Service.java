package com.yqq.thread.ch02.p85;


/**
 * synchronized(非 this )
 */
public class Service {

    private String usernameParam;

    private String passwordParam;

    public void setUsernamePassword(String username, String password){

        try {
            /**
             * 不同对象锁，代码异步
             */
            String anyString = new String();
            synchronized (anyString){
                System.out.println("线程名称： " + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入同步代码块" );
                usernameParam = username;
                Thread.sleep(3000);
                passwordParam = password;
                System.out.println("线程名称： "+ Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "离开代码块");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
