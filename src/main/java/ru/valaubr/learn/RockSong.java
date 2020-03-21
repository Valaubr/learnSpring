/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.valaubr.learn;

import java.util.Date;

/**
 *
 * @author valaubr
 */
public class RockSong implements Music{
    
    private RockSong(){}
    
    public static RockSong getRockSong(){
        return new RockSong();
    }
    
    public void initMethod(){
        System.out.println("You have a good taste");
    }
    
    public void destroyMethod(){
        Date date = new Date();
        System.out.println("i`m die at: " + date.toString());
    }
        
    @Override
    public String getSong() {
        return "Starset - Perfect Machine";
    }
    
}
