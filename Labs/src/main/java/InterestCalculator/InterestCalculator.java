/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterestCalculator;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class InterestCalculator {
    public static void main(String[] args) {
        
        float annIntRate = InterestCalculatorGuts.checkFloatRange(1, 100, "What's the annual interest rate?");
        
        float compPeriod = InterestCalculatorGuts.valAndConPeriod("Please choose a compound period: quarterly, monthly, or daily");
        
        float principal = InterestCalculatorGuts.checkFloatRange(1, 2139095039, "How much do you want to invest? ");
        
        int yrsInvest = InterestCalculatorGuts.checkIntRange(1, 2147483647, "How many years do you want to invest? ");
        
        float compInt = InterestCalculatorGuts.compoundInterest(annIntRate, compPeriod);
        
        InterestCalculatorGuts.makeMoney(yrsInvest, principal, compInt, compPeriod);
    }
}
