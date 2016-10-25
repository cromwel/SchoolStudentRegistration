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
public class SchoolStudent {
    
        int max_students=50;
        int max_fields=3;
        int student_count = 0;
        
        String name;
        String age;
        String marks;
        String[][] record = new String[max_students][max_fields];
        
        private int i;
    

    public void classData(){
            
        System.out.println("\t ENTER NEW STUDENT INFORMATION");
        System.out.println("");
        
        System.out.println("First name : \t\t");
        Scanner name1 = new Scanner(System.in);
        name = name1.next();
        
        record[student_count][0] = name;
        
        System.out.println("");
        System.out.println("Age : \t\t");
        Scanner ageYear = new Scanner(System.in);
        age = ageYear.next();
        
        record[student_count][1] = age;
        
        System.out.println("");
        System.out.println("Marks : \t\t");
        Scanner score = new Scanner(System.in);
        marks = score.next(); 
        
        record[student_count][2] = marks;
        
        student_count++;
        
     
    
    }
    
        public void classList(){
      
            System.out.println("");
            System.out.println("\t\t LIST OF ALL STUDENTS");
            System.out.println("\t Name :\t" + "\t Age:\t" + "\t Marks:\t");
            
            for(i=0; i<student_count; i++){

            System.out.println("\t " +record[i][0] + "\t\t " +record[i][1] + "\t\t " +record[i][2]);  
            
        
            } 
        }
   
    
}
