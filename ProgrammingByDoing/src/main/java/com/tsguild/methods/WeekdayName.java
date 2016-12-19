/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.methods;

/**
 *
 * @author apprentice
 */
public class WeekdayName {
    public static String weekday_name(int day) {
        String result;
        switch(day) {
            case 1:
                result = "Sunday";
                    break;
            case 2:
                result = "Monday";
                break;
            case 3:
                result = "Tuesday";
                break;
            case 4:
                result = "Wednesday";
                break;
            case 5:
                result = "Thursday";
                break;
            case 6:
                result = "Friday";
                break;
            case 7:
                result = "Saturday";
                break;
            default:
                result = "Error";
        }

        return result;
    }

}
