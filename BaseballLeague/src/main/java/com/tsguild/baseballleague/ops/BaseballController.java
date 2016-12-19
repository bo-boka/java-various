/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.baseballleague.ops;

import com.tsguild.baseballleague.dao.BaseballDao;
import com.tsguild.baseballleague.ui.ConsoleIO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author apprentice
 */
public class BaseballController {
    
    BaseballDao dao = new BaseballDao();
    ConsoleIO console = new ConsoleIO();
    private boolean keepRunning = true;
    
    public void run(){
        try {
            dao.loadFile();
        } catch (IOException ex) {
            console.print("Unable to reach file.");
            Logger.getLogger(BaseballController.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (keepRunning){//TODO: arraylist brackets being added to each save
            menu();
            int choice = console.readInt("Please choose option number: ");
            switch (choice){
                case 1:
                    createTeam();
                    break;
                case 2:
                    createPlayer();
                    break;
                case 3:
                    listTeams();
                    break;
                case 4:
                    listPlayersOfTeam();
                    break;
                case 5:
                    trade();
                    break;
                case 6:
                    deletePlayer();
                    break;
                case 7:
                    try {
                        dao.saveFile();
                        keepRunning = false;
                    } catch (IOException ex) {
                        console.print("Unable to save file.");
                        Logger.getLogger(BaseballController.class.getName()).log(Level.SEVERE, null, ex);
                        keepRunning = false;
                    }
                    break;
                default:
                    break;
            }
        }
    }

    private void menu() {
        console.print("***Baseball League Option Menu***");
        console.print("1. Create Team");
        console.print("2. Create Player");
        console.print("3. List All Teams");
        console.print("4. List All Players on a Team");
        console.print("5. Trade Player");
        console.print("6. Delete Player");
        console.print("7. Save & Exit");
        
    }

    private void createTeam() {
        String tName = console.readString("Enter team name: ");
        ArrayList<String> players = new ArrayList<>();
        players.add(tName);
        players.add(console.readString("Enter player 1: "));
        players.add(console.readString("Enter player 2: "));
        players.add(console.readString("Enter player 3: "));
        players.add(console.readString("Enter player 4: "));
        players.add(console.readString("Enter player 5: "));
        players.add(console.readString("Enter player 6: "));
        players.add(console.readString("Enter player 7: "));
        players.add(console.readString("Enter player 8: "));
        players.add(console.readString("Enter player 9: "));
        
        dao.addTeam(tName, players);
    }

    private void createPlayer() {
        String tName = console.readString("To which team would you like to add a player?: ");
        String pName = console.readString("Enter player name: ");
        ArrayList<String> team = dao.removeTeam(tName);
        if (team == null){
            console.print("No team found.");
        } else {
            team.add(pName);
            dao.addTeam(tName, team);
        }
    }

    private void listTeams() {
        Set<String> keys = dao.getKeys();
        for (String team : keys){
            console.print(team);
        }
    }

    private void listPlayersOfTeam() {
        String tName = console.readString("Enter team to view: ");
        ArrayList<String> team = dao.getTeam(tName);
        if (team == null){
            console.print("No team found.");
        } else {
            for (String p : team){
            console.print(p);
            }
        }
    }

    private void trade() {
        String team1 = console.readString("From which team would you like to trade: ");
        String player1 = console.readString("Enter the player from that team: ");
        String team2 = console.readString("To which team would you like to trade: ");
        String player2 = console.readString("Enter the player from that team: ");
        dao.tradePlayers(team1, player1, team2, player2);
    }

    private void deletePlayer() {
        String tName = console.readString("From which team would you like to delete a player?: ");
        String pName = console.readString("Enter player name: ");
        dao.deletePlayer(tName, pName);
    }
}
