/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.valaubr.learn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author valaubr
 */
public class testSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music rockMusic = context.getBean("rockSong", Music.class);
        Music classicalMusic = context.getBean("classicalMusic", Music.class);
        MusicPlayer mpRock = new MusicPlayer(rockMusic);
        MusicPlayer mpClassical = new MusicPlayer(classicalMusic);
        mpRock.playMusic();
        mpClassical.playMusic();
        context.close();
    }
}
