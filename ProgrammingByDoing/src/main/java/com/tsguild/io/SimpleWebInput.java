/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.io;

import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class SimpleWebInput {
    public static void main(String[] args) throws Exception
	{
		URL mcool = new URL("https://cs.leanderisd.org/mitchellis.txt");
		Scanner webIn = new Scanner( mcool.openStream() );
	
		String one = webIn.nextLine();
                String two = webIn.nextLine();
		
		webIn.close();
		
		System.out.println(one);
                System.out.println(two);
	}
}
