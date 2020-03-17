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

    //IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }
    
    public void playMusic(){
        System.out.println("Music play: " + music.getSong());
    }
}
