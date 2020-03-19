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

//        Music music = context.getBean("musicBean", Music.class);
        MusicPlayer mp = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer mp2 = context.getBean("musicPlayer", MusicPlayer.class);
        mp.playMusic();
        
        System.out.println(mp == mp2);
        //System.out.println(mp.getVolume());
        context.close();
    }
}
