/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.records;

class Student{
    String name;
    int grade;
    double average;
    
    public String toString()
	{
	return (this.name + ", " + this.grade + "  " + this.average);
	}
}

public class BasicRecords {
    public static void main(String[] args) {
        
        Student one = new Student();
        one.name = "George";
        one.grade = 10;
        one.average = 88.9;
        
        Student two = new Student();
        two.name = "Sally";
        two.grade = 12;
        two.average = 90.5;
        
        Student three = new Student();
        three.name = "Kim";
        three.grade = 9;
        three.average = 93.7;
        
        System.out.println("The names are: "+one.name+" "+two.name+" "+three.name);
        System.out.println("The grades are: "+one.grade+" "+two.grade+" "+three.grade);
        System.out.println("The averages are "+one.average+" "+two.average+" "+three.average);
        
        System.out.println("The average of the three students is: "+(one.average+two.average+three.average)/3);
    }
}
