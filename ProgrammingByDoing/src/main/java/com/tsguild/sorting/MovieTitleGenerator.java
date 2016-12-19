/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.sorting;

import java.net.URL;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class MovieTitleGenerator {
    public static void main(String[] args) throws Exception
	{
            Random rand = new Random();
            
            String[] adjectives = arrayFromUrl("https://cs.leanderisd.org/txt/adjectives.txt");
            String[] nouns      = arrayFromUrl("https://cs.leanderisd.org/txt/nouns.txt");

            System.out.println("Mitchell's Random Movie Title Generator\n");

            System.out.print("Choosing randomly from " + adjectives.length + " adjectives ");
            System.out.println("and " + nouns.length + " nouns (" + (adjectives.length*nouns.length) + " combinations).");

            
            
            String adjective = adjectives[rand.nextInt(adjectives.length)];
            String noun = nouns[rand.nextInt(nouns.length)];

            System.out.println( "Your movie title is: " + adjective + " " + noun );
	}

	/**
	*	@param url - the URL to read words from
	*	@return An array of words, initialized from the given URL
	*/	
	public static String[] arrayFromUrl( String url ) throws Exception
	{
            Scanner fin = new Scanner((new URL(url)).openStream());
            int count = fin.nextInt();

            String[] words = new String[count];

            for ( int i=0; i<words.length; i++ )
            {
                    words[i] = fin.next();
            }
            fin.close();

            return words;
	}
}
