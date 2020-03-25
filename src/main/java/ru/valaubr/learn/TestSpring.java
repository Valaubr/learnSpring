/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.valaubr.learn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author valaubr
 */
public class TestSpring {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer.toString());
        context.close();
    }
}
