/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolstudent;

import java.util.Scanner;

/**
 *
 * @author lindy
 */
public class StudentMenu {

   // private static String option;
    
    public void menu(){
            System.out.println("");
            System.out.println("\t SELECT AN OPTION : \n \t\t_______");
            System.out.println("1. Enter new student");
            System.out.println("2. View all students");
            System.out.println("3. Exit");
            System.out.println("");
            System.out.println("You would like to:  ");
    
    }
    


    public static void main(String[] args) {

        SchoolStudent fresher = new SchoolStudent();
        StudentMenu listing = new StudentMenu();
        
        String option = "";
           
         Scanner input = new Scanner(System.in);

            listing.menu();
            option=input.next();
         
        while(!option.equals("3")){               

            //String option;
                switch(option){
                        case "1":
                        fresher.classData();
                            break;

                        case "2":
                        fresher.classList();
                            break;
                        
                        case "3":
                            break;

                        default: 
                            System.out.print("invalid option");


                    }
                
                listing.menu();
                option = input.next();
        }

    }

}

