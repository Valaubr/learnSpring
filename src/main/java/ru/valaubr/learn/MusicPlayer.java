/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.valaubr.learn;

import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author valaubr
 */
@Component
public class MusicPlayer {

    private final Music rockMusic;
    private final Music jazzMusic;

    @Autowired
    public MusicPlayer(@Qualifier("rockSong") Music rockSong,
            @Qualifier("jazzMusic") Music jazzMusic) {
        this.rockMusic = rockSong;
        this.jazzMusic = jazzMusic;
    }

    public String playMusic(TypeOfMusic type) {
        Random randi = new Random();
        int i = randi.nextInt(2);
        switch(type){
            case ROCK_SONG: 
                return rockMusic.getSong()[i];
            case JAZZ_SONG: 
                return jazzMusic.getSong()[i];
        }
        return null;
    }
}
