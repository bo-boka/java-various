/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentQuizScores;

import com.tsguild.consoleio.IOUserPrompt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class QuizScoresUI {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Scores> quizzes = new ArrayList<>();
        Scores earl = new Scores(78.05, 92.77, 69.36, 88.12);
        Scores shirley = new Scores(80.3, 95.45, 79.90, 91.12);
        Scores barbara = new Scores(84.3, 70.6, 96.86, 92.4);
        Scores bob = new Scores(77, 83, 90, 87);

        HashMap<String, Scores> studsAndQs = new HashMap<String, Scores>();
        studsAndQs.put("Earl Jones", earl);
        studsAndQs.put("Shirley Beaver", shirley);
        studsAndQs.put("Barbara Walters", barbara);
        studsAndQs.put("Bob Hope", bob);

//        Set<Entry<String, Scores>> view = students.entrySet();

        int choice = 0;
        while (choice != 6) {
            Scores.displayMenu();
            choice = Scores.checkIntRange(1, 6, "Please choose a number: ");

            switch (choice) {
                case 1:
                    System.out.println(studsAndQs);
                    break;
                case 2:
                    String name = IOUserPrompt.stringOut("Please enter the student's name: ");
                    double q1 = Scores.checkDoubleRange(0, 100, "Please enter a quiz score: ");
                    double q2 = Scores.checkDoubleRange(0, 100, "Please enter a quiz score: ");
                    double q3 = Scores.checkDoubleRange(0, 100, "Please enter a quiz score: ");
                    double q4 = Scores.checkDoubleRange(0, 100, "Please enter a quiz score: ");
                    studsAndQs.put(name, new Scores(q1, q2, q3, q4));
                    break;
                case 3:
                    name = IOUserPrompt.stringOut("Which student would you like to remove?: ");
                    studsAndQs.remove(name);
                    break;
                case 4:
                    name = IOUserPrompt.stringOut("Which student would you like to view?: ");
                    System.out.println(studsAndQs.get(name));
                    break;
                case 5:
                    name = IOUserPrompt.stringOut("Which student would you like to average?: ");
                    if (name.equals("Earl Jones")){
                        System.out.println((earl.getQuiz1() + earl.getQuiz2() + earl.getQuiz3() + earl.getQuiz4())/4);
                    } else if (name.equals("Shirley Beaver")){
                        System.out.println((shirley.getQuiz1() + shirley.getQuiz2() + shirley.getQuiz3() + shirley.getQuiz4())/4);
                    } else if (name.equals("Bob Hope")){
                        System.out.println((bob.getQuiz1() + bob.getQuiz2() + bob.getQuiz3() + bob.getQuiz4())/4);
                    } else if (name.equals("Barbara Walters")){
                        System.out.println((barbara.getQuiz1() + barbara.getQuiz2() + barbara.getQuiz3() + barbara.getQuiz4())/4);
                    }
                    break;
                case 6:
                    System.out.println("Thank you. Goodbye.");
                    break;
            }
        }
    }
}
