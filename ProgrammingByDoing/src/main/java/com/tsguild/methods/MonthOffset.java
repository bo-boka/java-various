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
public class MonthOffset {

    public static int month_offset(int month) {
        int result;
        switch (month) {
            case 1:
                result = 1;
                break;
            case 2:
                result = 4;
                break;
            case 3:
                result = 4;
                break;
            case 4:
                result = 0;
                break;
            case 5:
                result = 2;
                break;
            case 6:
                result = 5;
                break;
            case 7:
                result = 0;
                break;
            case 8:
                result = 3;
                break;
            case 9:
                result = 6;
                break;
            case 10:
                result = 1;
                break;
            case 11:
                result = 4;
                break;
            case 12:
                result = 6;
                break;
            default:
                result = -1;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Month 1: " + month_offset(1));
        System.out.println("Month 2: " + month_offset(2));
        System.out.println("Month 3: " + month_offset(3));
        System.out.println("Month 4: " + month_offset(4));
        System.out.println("Month 5: " + month_offset(5));
        System.out.println("Month 6: " + month_offset(6));
        System.out.println("Month 7: " + month_offset(7));
        System.out.println("Month 8: " + month_offset(8));
        System.out.println("Month 9: " + month_offset(9));
        System.out.println("Month 10: " + month_offset(10));
        System.out.println("Month 11: " + month_offset(11));
        System.out.println("Month 12: " + month_offset(12));
        System.out.println("Month 43: " + month_offset(43));
    }
}
