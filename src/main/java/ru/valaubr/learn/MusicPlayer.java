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
public class MusicPlayer {
    @Autowired
    private RockSong music;

    public String playMusic(){
        return music.getSong();
    }
}
