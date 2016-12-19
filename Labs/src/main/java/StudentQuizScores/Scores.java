/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentQuizScores;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class Scores {
    
    double quiz1;
    double quiz2;
    double quiz3;
    double quiz4;
    
    public Scores(){}
    
    public Scores(double quiz1In, double quiz2In, double quiz3In, double quiz4In){
       
        this.quiz1 = quiz1In;
        this.quiz2 = quiz2In;
        this.quiz3 = quiz3In;
        this.quiz4 = quiz4In;
        
    }
    
    public static void displayMenu(){
        
        System.out.println("***STUDENT QUIZ SCORES***");
        System.out.println("\n1) View Student List");
        System.out.println("2) Add Student");
        System.out.println("3) Remove Student");
        System.out.println("4) View A Student's Scores");
        System.out.println("5) View A Student's Average");
        System.out.println("6) Exit");
    }
    
    public static int intOut(String prompt){
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        int num = sc.nextInt();
        return num;
    }
    
    public static int checkIntRange(int min, int max, String prompt){
        int num = intOut(prompt);
        while (num < min || num > max){
            System.out.println("Invalid answer.");
            num = intOut(prompt);
        }
        return num;
    }
    
    public static double doubleOut(String prompt){
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        double num = sc.nextDouble();
        return num;
    }
    
    public static double checkDoubleRange(double min, double max, String prompt){
        double num = doubleOut(prompt);
        while (num < min || num > max){
            System.out.println("Invalid answer.");
            num = doubleOut(prompt);
        }
        return num;
    }

    public double getQuiz1() {
        return quiz1;
    }

    public void setQuiz1(double quiz1) {
        this.quiz1 = quiz1;
    }

    public double getQuiz2() {
        return quiz2;
    }

    public void setQuiz2(double quiz2) {
        this.quiz2 = quiz2;
    }

    public double getQuiz3() {
        return quiz3;
    }

    public void setQuiz3(double quiz3) {
        this.quiz3 = quiz3;
    }

    public double getQuiz4() {
        return quiz4;
    }

    public void setQuiz4(double quiz4) {
        this.quiz4 = quiz4;
    }
    
    @Override
    public String toString(){
        return "\n"+quiz1 + "\n"+quiz2+ "\n"+quiz3+ "\n"+quiz4+"\n";
    }
}
