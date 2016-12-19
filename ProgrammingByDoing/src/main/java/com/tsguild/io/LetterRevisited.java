/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author apprentice
 */
public class LetterRevisited{ //curly removed to tag
                            //can't find letter.txt file
    public static void main(String[] args) throws IOException {
        String fileName = "letter.txt";
        FileWriter scribe = new FileWriter(fileName);
        PrintWriter teller = new PrintWriter(scribe);
        
        teller.println("This is a letter to myself to tell me to keep working hard");
        teller.println("Harder and harder and harder....");
        teller.flush();
        
        teller.close();
        scribe.close();
        
    }
}
