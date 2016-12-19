/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.baseballleague.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author apprentice
 */
public class BaseballDao {

    private HashMap<String, ArrayList<String>> league;
    private final String FILE_NAME;
    private final String DELIMITER;
    ArrayList<String> teamList;
    
    public BaseballDao(){
        league = new HashMap<>();
        FILE_NAME = "league.txt";
        DELIMITER = "::";
        
    }
    
    public void addTeam(String tName, ArrayList<String> newList){
        league.put(tName, newList);
    }
    
    public ArrayList<String> removeTeam(String tName){
        return league.remove(tName);
    }
    
    public Set getKeys(){
        return league.keySet();
    }
    
    public ArrayList<String> getTeam(String tName) {
        return league.get(tName);
    }
    
    public void tradePlayers(String team1, String player1, String team2, String player2){
        league.get(team1).add(player2);
        league.get(team2).add(player1);
        league.get(team1).remove(player1);
        league.get(team2).remove(player2);
        
    }
    
    public void deletePlayer(String tName, String pName){
        league.get(tName).remove(pName);
    }
    
    public void loadFile() throws IOException {
        
        Scanner reader;
        try {
            reader = new Scanner(new BufferedReader(new FileReader(FILE_NAME)));
        
            while (reader.hasNextLine()){

                String line = reader.nextLine();
                String[] team = line.split(DELIMITER);
                teamList = new ArrayList<>();
                for (String x : team){
                    teamList.add(x);
                }
                
                league.put(teamList.get(0), teamList);
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BaseballDao.class.getName()).log(Level.SEVERE, null, ex);
            new FileWriter(FILE_NAME);
        }
    }
    
    public void saveFile() throws IOException {
        
        PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME));
        for (ArrayList<String> p : league.values()){
            for (int i = 0; i < p.size(); i++) {
                writer.print(p.get(i)+DELIMITER);
            }
            writer.println();
        }
        writer.flush();
        writer.close();
    }

    
    
}
