/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.valaubr.learn;

/**
 *
 * @author valaubr
 */
public class MusicPlayer {
    private Music music;

    private String name;
    private int volume;
    
    public MusicPlayer(){}
    
    //IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
    
    
    public void playMusic(){
        System.out.println("Music play: " + music.getSong());
    }
}
