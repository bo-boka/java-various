/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StateCapitals;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class StateCapitals {

    public static void main(String[] args) {

        HashMap<String, String> stateCap = new HashMap<>();

        stateCap.put("WYOMING", "CHEYENNE");
        stateCap.put("VERMONT", "MONTPELIER");
        stateCap.put("ALASKA", "JUNEAU");
        stateCap.put("NORTH DAKOTA", "BISMARCK");
        stateCap.put("SOUTH DAKOTA", "PIERRE");
        stateCap.put("DELAWARE", "DOVER");
        stateCap.put("MONTANA", "HELENA");
        stateCap.put("RHODE ISLAND", "PROVIDENCE");
        stateCap.put("NEW HAMPSHIRE", "CONCORD");
        stateCap.put("MAINE", "AUGUSTA");
        stateCap.put("HAWAII", "HONOLULU");
        stateCap.put("IDAHO", "BOISE");
        stateCap.put("WEST VIRGINIA", "CHARLESTON");
        stateCap.put("NEBRASKA", "LINCOLN");
        stateCap.put("NEW MEXICO", "SANTA FE");
        stateCap.put("NEVADA", "CARSON CITY");
        stateCap.put("KANSAS", "TOPEKA");
        stateCap.put("UTAH", "SALT LAKE CITY");
        stateCap.put("MISSISSIPPI", "JACKSON");
        stateCap.put("ARKANSAS", "LITTLE ROCK");
        stateCap.put("IOWA", "DES MOINES");
        stateCap.put("CONNECTICUT", "HARTFORD");
        stateCap.put("OKLAHOMA", "OKLAHOMA CITY");
        stateCap.put("OREGON", "SALEM");
        stateCap.put("KENTUCKY", "FRANKFORT");
        stateCap.put("LOUISIANA", "BATON ROUGE");
        stateCap.put("SOUTH CAROLINA", "COLUMBIA");
        stateCap.put("ALABAMA", "MONTGOMERY");
        stateCap.put("COLORADO", "DENVER");
        stateCap.put("MINNESOTA", "SAINT PAUL");
        stateCap.put("WISCONSIN", "MADISON");
        stateCap.put("MARYLAND", "ANNAPOLIS");
        stateCap.put("MISSOURI", "JEFFERSON CITY");
        stateCap.put("TENNESSEE", "NASHVILLE");
        stateCap.put("INDIANA", "INDIANAPOLIS");
        stateCap.put("ARIZONA", "PHOENIX");
        stateCap.put("MASSACHUSETTS", "BOSTON");
        stateCap.put("WASHINGTON", "OLYMPIA");
        stateCap.put("VIRGINIA", "RICHMOND");
        stateCap.put("NEW JERSEY", "TRENTON");
        stateCap.put("MICHIGAN", "LANSING");
        stateCap.put("NORTH CAROLINA", "RALEIGH");
        stateCap.put("GEORGIA", "ATLANTA");
        stateCap.put("OHIO", "COLUMBUS");
        stateCap.put("PENNSYLVANIA", "HARRISBURG");
        stateCap.put("ILLINOIS", "SPRINGFIELD");
        stateCap.put("NEW YORK", "ALBANY");
        stateCap.put("FLORIDA", "TALLAHASSEE");
        stateCap.put("TEXAS", "AUSTIN");
        stateCap.put("CALIFORNIA", "SACRAMENTO");

        System.out.println("\nSTATES:");
        System.out.println("========");
        Set<String> keys = stateCap.keySet();
        for (String states : keys) {
            System.out.println(states);
        }
        System.out.println("\nCAPITALS:");
        System.out.println("=========");
        Collection<String> vals = stateCap.values();
        for (String capitals : vals) {
            System.out.println(capitals);
        }
        System.out.println("\nSTATE/CAPITAL PAIRS:");
        System.out.println("===================");
        Set<Entry<String, String>> both = stateCap.entrySet();
        for (Entry<String, String> entry : both) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Type in a State name and I'll return the Capital: ");
            String state = sc.nextLine();
            System.out.println("The capital of "+ state +" is "+ stateCap.get(state));
        }
        
//        //NEED TO DECLARE NEW ENTRYSET OBJ?
//        //for (int i = 0; i < 5; i++) {
//            System.out.println("Type in a State Capital and I'll return the State: ");
//            String capital = sc.nextLine();
//            for (Entry<String, String> entry : both) {
//                if (entry.getValue() == capital){
//                    System.out.println("The state of the capital, " + capital + " is " + entry.getKey());
//                }
//            }
//        //}
    }
}
