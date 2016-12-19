/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.records;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */

class Grade{
    int id;
    int gradeNum;
    int gradeVal;
    String letterGrade;
    
    public String toString(){
        return "ID: "+this.id +" - Grade Number: "+ this.gradeNum +" - Grade Value: "+ this.gradeVal +" - Letter Grade "+ this.letterGrade;
    }
    
}

public class SortingRecordsOnTwoFields {
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner reader = new Scanner(new BufferedReader(new FileReader("grades.txt")));
        Grade[] grade = new Grade[30];
        
        grade[0] = new Grade();
        grade[1] = new Grade();
        grade[2] = new Grade();
        grade[3] = new Grade();
        grade[4] = new Grade();
        grade[5] = new Grade();
        grade[6] = new Grade();
        grade[7] = new Grade();
        grade[8] = new Grade();
        grade[9] = new Grade();
        grade[10] = new Grade();
        grade[11] = new Grade();
        grade[12] = new Grade();
        grade[13] = new Grade();
        grade[14] = new Grade();
        grade[15] = new Grade();
        grade[16] = new Grade();
        grade[17] = new Grade();
        grade[18] = new Grade();
        grade[19] = new Grade();
        grade[20] = new Grade();
        grade[21] = new Grade();
        grade[22] = new Grade();
        grade[23] = new Grade();
        grade[24] = new Grade();
        grade[25] = new Grade();
        grade[26] = new Grade();
        grade[27] = new Grade();
        grade[28] = new Grade();
        grade[29] = new Grade();
        
        while (reader.hasNext()){
            for (Grade elem : grade) {
                elem.id = reader.nextInt();
                elem.gradeNum = reader.nextInt();
                elem.gradeVal = reader.nextInt();
                elem.letterGrade = reader.next();
            }
        }
        reader.close();
        for (int i = 0; i < grade.length; i++) {
            for (int j = 0; j < grade.length; j++) {
                if (grade[i].gradeNum > grade[j].gradeNum){
                    Grade temp = grade[i];
                    grade[i] = grade[j];
                    grade[j] = temp;
                }
            }
            
        }
        for (int i = 0; i < grade.length; i++) {
            System.out.println(grade[i]);
        }
    }
}
