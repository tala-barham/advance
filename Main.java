/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproject1.firstproject1;

import com.mycompany.firstproject1.firstproject1.MasterStudents.BAdegree;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import java.util.Scanner;


public class Main {
   private static int countAdd=0,countRetrieve=0, countRemove=0;
   private static int count;         
    public Main(){}
     public static void addStudents(ArrayList<Student>newstudent){
     Scanner sc=new Scanner(System.in);
     Student s=new Student();
     System.out.println("enter name");
     String name=sc.nextLine();
     s.setName(name);
     //System.out.println("enter ID");
     s.setId(count);
     System.out.println("enter bdyear");
     int bdyear=sc.nextInt();
     s.setBdyear(bdyear);
     System.out.println("enter month");
     int month=sc.nextInt();
     s.setMonth(month);
     System.out.println("enter day");
     int day=sc.nextInt();
     s.setDay(day);
        newstudent.add(s); 
       countAdd++;
       count++;
        System.out.println("Student added");
      System.out.println("countAdd=" +countAdd);
      
     }
   
public static void retrievStudent(ArrayList<Student>newStudent) {
   
    for (Student s : newStudent) {
        System.out.println(s);countRetrieve++;
    }
    
    System.out.println(" countRetrieve="+countRetrieve);
}
public static void removeStudent(ArrayList<Student>newStudent){
    
    Scanner in=new Scanner(System.in);
    System.out.println("inter id to remove student");
    int id=in.nextInt();
     for (Student s : newStudent) {
        if (s.getId()==id){
           newStudent.remove(s);
           System.out.println("Student removed");
           countRemove++;
        System.out.println("countRemove=" +countRemove);
           break;
           
     }
        else
            System.out.println("Sorry, no such student with this " + id + " " + "number exist");
        
     }
}
 public static String Report(){
        String s="Report of the opration that made in the system.\n"
                + "The numbers of add is: "+countAdd
                +"\nThe numbers of remove is: "+countRemove
                +"\nThe numbers of retrieve is:"+countRetrieve;
         return s;
    }

    public static void main(String args[]){
        ArrayList<Student>list=new ArrayList(); 
      Scanner in=new Scanner(System.in);
      Medicalstudents s=new Medicalstudents("tala",2000,5,2,"c++","hos");
      s.submitResearch("java");
      System.out.println(s.getSub());
      System.out.println(s.calculateAge(LocalDate.of(2000, 5, 2)));
      System.out.println(s.toString());
      
      MasterStudents s1=new MasterStudents("tala",2005,5,7,"c","zozo");
      s1.setStu(BAdegree.Law);
      System.out.println(s1.getStu());
      System.out.println(s1.getSupervisor());
      s1.submitResearch("c");
      System.out.println(s1.getSub());
      System.out.println(s1.toString());
      
      EngineeringStudents s2=new EngineeringStudents("lara",2005,8,16,"physics");
      System.out.println(s2.getLap());

       while (true) {
       int select;
       System.out.println("1. Add Student");
       System.out.println("2. retriev Student");
       System.out.println("3. remove Student");
       System.out.println("4.Report");
       System.out.println("5. Exit");
       select = in.nextInt();
        switch (select){
        case 1:
        addStudents(list);
            break;
        case 2:
         retrievStudent(list);
            break;
        case 3:
          removeStudent(list);
            break;
        case 4:
           System.out.print(Report());
            break;
        case 5:
         System.exit(0);
    }
}
}
}
