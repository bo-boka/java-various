/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.probydo_whileloops_2;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class Adventure2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nextroom = 1;

        while (nextroom != 0) {
            if (nextroom == 1) {
                System.out.println("You are standing in an open field west of a white house,");
                System.out.println("With a boarded front door.");
                System.out.println("There is a small mailbox here.");
                System.out.println("Go to the house, or open the mailbox?");
                String action = sc.nextLine();
                if (action.equals("open the mailbox")) {
                    nextroom = 2;
                } else if (action.equals("go to the house")) {
                    nextroom = 3;
                }
            }

            if (nextroom == 2) {
                System.out.println("You open the mailbox.");
                System.out.println("It's really dark in there.");
                System.out.println("Look inside or stick your hand in?");
                String action = sc.nextLine();
                if (action.equals("look inside")) {
                    nextroom = 4;
                } else if (action.equals("stick your hand in")) {
                    nextroom = 5;
                }
            }

            if (nextroom == 4) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So... so very dark.");
                System.out.println("Go back or keep looking?");
                String action = sc.nextLine();
                if (action.equals("keep looking")) {
                    nextroom = 6;
                } else if (action.equals("go back")) {
                    nextroom = 1;
                }
            }

            if (nextroom == 6) {
                System.out.println("Turns out, hanging out around dark places isn't a good idea");
                System.out.println("You've been eaten by a grue.");
                nextroom = 0;
            }
            if (nextroom == 5) {
                System.out.println("You stick your hand in very quickly.");
                System.out.println("In your haste, you poked a grue in the eye and it runs away crying.");
                System.out.println("You find two letters, one green from grue snot, the other has been rain-washed all white. Open the green letter or open the white letter?");
                String action = sc.nextLine();
                if (action.equals("open the white letter")) {
                    nextroom = 7;
                } else if (action.equals("open the green letter")) {
                    nextroom = 8;
                }
            }

            if (nextroom == 7) {
                System.out.println("You open the white letter.");
                System.out.println("It says your insurance premium just went up. Welcome back to the real world.");
                System.out.println("You go back.");
                nextroom = 1;
            }
            if (nextroom == 8) {
                System.out.println("You wipe the snot away and open the green letter.");
                System.out.println("It's an invitaion to Hogwarts. Welcome to the wizarding world!");
                nextroom = 0;
            }

            if (nextroom == 3) {
                System.out.println("You walk toward the house.");
                System.out.println("You need a place to sleep but it says 'Do Not Enter'");
                System.out.println("Go in or head towards the forest?");
                String action = sc.nextLine();
                if (action.equals("go in")) {
                    nextroom = 9;
                } else if (action.equals("head towards the forest")) {
                    nextroom = 10;
                }
            }
            if (nextroom == 9) {
                System.out.println("You try to get in the house.");
                System.out.println("There's an ax near the boarded up door, but the dark musty cellar door is open.");
                System.out.println("Ax through the door or go into the cellar?");
                String action = sc.nextLine();
                if (action.equals("ax through the door")) 
                    nextroom = 11;
                else if (action.equals("go into the cellar")) 
                    nextroom = 12;
                }

            if (nextroom == 11) {
                System.out.println("You take the ax to the door.");
                System.out.println("The ax is dull and you spend an hour trying to get in.");
                System.out.println("When you finally get the boards off, you notice the window was open the whole time and go in.");
                System.out.println("You're tired and hungry. Go to the bedroom or go to the kitchen?");
                String action = sc.nextLine();
                if (action.equals("go to the bedroom")) 
                    nextroom = 13;
                else if (action.equals("go to the kitchen")) 
                    nextroom = 14;
                }

            if (nextroom == 13) {
                System.out.println("You went to the bedroom.");
                System.out.println("The bed is inveted with bedbugs. You're itchy for a week.");
                System.out.println("You go back");
                nextroom = 1;
            }
            if (nextroom == 14) {
                System.out.println("You go to the kitchen");
                System.out.println("You open the fridge, but instead of food, it's a portal to a parallel universe!");
                nextroom = 0;
            }
            if (nextroom == 12) {
                System.out.println("You go into the cellar.");
                System.out.println("The mad hatter is having a tea party with moonshine instead of tea!");
                System.out.println("Drink the moonshine or politely decline.");
                String action = sc.nextLine();
                if (action.equals("drink the moonshine")) 
                    nextroom = 15;
                else if (action.equals("politely decline"))
                    nextroom = 16;
            }

            if (nextroom == 15) {
                System.out.println("You drink too much of the moonshine.");
                System.out.println("You woke up on a giant mushroom, naked, next to Alice");
                nextroom = 0;
            } 
            if (nextroom == 16) {
                System.out.println("You politely decline the moonshine.");
                System.out.println("The Mad Hatter becomes enraged.");
                System.out.println("Go back");
                nextroom = 1;
            }
                
            if (nextroom == 10) {
                System.out.println("You start running towards the forest");
                System.out.println("You see a troll on the edge of the forest.");
                System.out.println("Ask for directions or avoid him.");
                String action = sc.nextLine();
                if (action.equals("ask for directions")) 
                    nextroom = 17;
                 else if (action.equals("avoid him")) 
                    nextroom = 18;
                }

            if (nextroom == 17) {
                System.out.println("You ask him for directions.");
                System.out.println("He promptly says something racist using false statistics and goes back to provoking arguments on Youtube.");
                nextroom = 0;

                }
            if (nextroom == 18) {
                    System.out.println("You avoid the troll and go into the forest to sleep and forage.");
                    nextroom = 0;
                
            }
        }
    }
}

