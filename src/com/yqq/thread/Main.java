package com.yqq.thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        for (int i = 0; i < 100; i++) {
            int j = i;
            CompletableFuture<Void> voidCompletableFuture = CompletableFuture.runAsync(() -> {
                try {
                    System.out.println(j + ": " + Thread.currentThread().getName());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            voidCompletableFuture.get();
            System.out.println("i = " + i);
            //Thread.sleep(100);

        }

        //Thread.sleep(100);
    }
}
