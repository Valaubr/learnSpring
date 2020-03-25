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
public class JazzMusic implements Music{

    String[] listOfMusic = {"Ray Charl`z - Hit The Road Jack_V1",
        "Ray Charl`z - Hit The Road Jack_V2",
        "Ray Charl`z - Hit The Road Jack_V3"};
    @Override
    public String[] getSong(){
        return listOfMusic;
    }
    
}
