/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.valaubr.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author valaubr
 */
@Component
public class Computer {
    private final int id;
    private final MusicPlayer musicPlayer;
    @Autowired
    public Computer(MusicPlayer musicPlayer){
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }
   
    @Override
    public String toString() {
        return "Computer{" + "id=" + id + ", musicPlayer=" + musicPlayer.playMusic(TypeOfMusic.ROCK_SONG) + '}';
    }
}
