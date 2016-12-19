/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.baseballleague;

import com.tsguild.baseballleague.ops.BaseballController;

/**
 *
 * @author apprentice
 */
public class BaseballLeagueApp {
    
    public static void main(String[] args) {
        BaseballController controller = new BaseballController();
        controller.run();
        
        
        
        
//        Set<Entry<String, ArrayList<Player>>> keys = league.entrySet();
//        for (Entry<String, ArrayList<Player>> n : keys){
//            System.out.println(n);
//        }
        
    }
    
}
