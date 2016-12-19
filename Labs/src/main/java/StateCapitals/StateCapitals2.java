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
public class StateCapitals2 {

    public static void main(String[] args) {

        HashMap<String, Capital> stateCap = new HashMap<>();

        stateCap.put("WYOMING", new Capital("Cheyenne", 3000000, 156));
        stateCap.put("VERMONT", new Capital("MONTPELIER", 400308107, 298));
        stateCap.put("ALASKA", new Capital("JUNEAU", 398749283, 342));
        stateCap.put("NORTH DAKOTA", new Capital("BISMARCK", 438798234, 345));
        stateCap.put("SOUTH DAKOTA", new Capital("PIERRE", 987342059, 242));
        stateCap.put("DELAWARE", new Capital("DOVER", 238749454, 463));
        stateCap.put("MONTANA", new Capital("HELENA", 287984034, 362));
        stateCap.put("RHODE ISLAND", new Capital("PROVIDENCE", 623879424, 234));
        stateCap.put("NEW HAMPSHIRE", new Capital("CONCORD", 327520934, 473));
        stateCap.put("MAINE", new Capital("AUGUSTA", 3294901, 374));
        stateCap.put("HAWAII", new Capital("HONOLULU", 38289503, 876));
        stateCap.put("IDAHO", new Capital("BOISE", 32498233, 362));
        stateCap.put("WEST VIRGINIA", new Capital("CHARLESTON", 28374324, 342));
        stateCap.put("NEBRASKA", new Capital("LINCOLN", 23498234, 332));
        stateCap.put("NEW MEXICO", new Capital("SANTA FE", 234985723, 342));
        stateCap.put("NEVADA", new Capital("CARSON CITY", 342532342, 324));
        stateCap.put("KANSAS", new Capital("TOPEKA", 369434782, 232));
        stateCap.put("UTAH", new Capital("SALT LAKE CITY", 23428394, 234));
        stateCap.put("MISSISSIPPI", new Capital("JACKSON", 2349845, 342));
        stateCap.put("ARKANSAS", new Capital("LITTLE ROCK", 234745932, 321));
        stateCap.put("IOWA", new Capital("DES MOINES", 123359283, 323));
        stateCap.put("CONNECTICUT", new Capital("HARTFORD", 234985303, 213));
        stateCap.put("OKLAHOMA", new Capital("OKLAHOMA CITY", 24894593, 231));
        stateCap.put("OREGON", new Capital("SALEM", 234984509, 231));
        stateCap.put("KENTUCKY", new Capital("FRANKFORT", 1238734323, 324));
        stateCap.put("LOUISIANA", new Capital("BATON ROUGE", 2874672, 272));
        stateCap.put("SOUTH CAROLINA", new Capital("COLUMBIA", 234872943, 232));
        stateCap.put("ALABAMA", new Capital("MONTGOMERY", 238482934, 234));
        stateCap.put("COLORADO", new Capital("DENVER", 287358543, 352));
        stateCap.put("MINNESOTA", new Capital("SAINT PAUL", 273487329, 643));
        stateCap.put("WISCONSIN", new Capital("MADISON", 359030934, 898));
        stateCap.put("MARYLAND", new Capital("ANNAPOLIS", 324789843, 342));
        stateCap.put("MISSOURI", new Capital("JEFFERSON CITY", 1734832903, 234));
        stateCap.put("TENNESSEE", new Capital("NASHVILLE", 32893292, 227));
        stateCap.put("INDIANA", new Capital("INDIANAPOLIS", 23893249, 211));
        stateCap.put("ARIZONA", new Capital("PHOENIX", 32829294, 328));
        stateCap.put("MASSACHUSETTS", new Capital("BOSTON", 2734893, 234));
//        populations and sq are random

        Set<Entry<String, Capital>> boths = stateCap.entrySet();
        for (Entry<String, Capital> prnt : boths){
            System.out.println(prnt);
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter minimum: ");
        int min = sc.nextInt();
        System.out.println("Listing greater pops:");
        for (Entry<String, Capital> prnt : boths){
            if (prnt.getValue().population > min){
                System.out.println(prnt);
            }
        }
        
    }
}
