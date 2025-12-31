import java.util.Scanner;
public class QuizApplication {
    public static void main(String[] args) {

      String[] questions = {
            "1. What is the size of int in Java?\nA. 2 bytes\nB. 4 bytes\nC. 8 bytes\nD. Depends on system",
            "2. Which keyword is used to inherit a class in Java?\nA. implement\nB. extends\nC. inherits\nD. super",
            "3. Which loop is guaranteed to execute at least once?\nA. for\nB. while\nC. do-while\nD. foreach",
            "4. Which of these is not a Java data type?\nA. int\nB. float\nC. boolean\nD. real",
            "5. What is the default value of boolean?\nA. true\nB. false\nC. 0\nD. null"
        };


        Scanner sc = new Scanner(System.in);
        int[] score= new int[5];
        int marks = 0;
        char answer;
        for(int i=0;i<5;i++){
            System.out.print("\n" + questions[i]);
            System.out.print("Enter your answer (A/B/C/D): ");
            answer = sc.next().toUpperCase().charAt(0);
            
            switch(i){
            case 0: 
                if(answer=='B')marks++;
                break;
            
             case 1: 
                if(answer=='B')marks++;
                break;
            
             case 2: 
                if(answer=='C')marks++;
                break;
            
             case 3: 
                if(answer=='D')marks++;
                break;
            
             case 4: 
                if(answer=='B')marks++;
                break;
            }

           

        }
         System.out.println("Your Score: " + marks + " / 5");
    }
}