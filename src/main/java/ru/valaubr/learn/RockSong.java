/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.valaubr.learn;

import org.springframework.stereotype.Component;

/**
 *
 * @author valaubr
 */
@Component
public class RockSong implements Music{
    
    private RockSong(){}
        
    @Override
    public String getSong() {
        return "Starset - Perfect Machine";
    }
    
}
