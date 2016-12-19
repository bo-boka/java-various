/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factorizor;



/**
 *
 * @author apprentice
 */
public class Factorizor {
    public static void main(String[] args) {
        
        FactorizorGuts factor = new FactorizorGuts();
       
        int num = factor.checkIntRange(0, 100000);
        
        factor.factorize(num);
        factor.countFactors(num);
        factor.perfectNum(num);
        
        
    }
}
