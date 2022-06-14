package com.yqq.ch03;

import java.io.Console;

/**
 * description:
 * Created by yqq
 * 2022-01-25
 */
public class Main {
    public static void main(String[] args) {

        Console console = System.console();
        String userName = console.readLine("user name");



        char[] password = console.readPassword("password");



    }
}
