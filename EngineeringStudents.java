/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproject1.firstproject1;


public class EngineeringStudents extends Student {
    private String lap;
    
   public EngineeringStudents(String name,int bdyear,int month,int day,String lap){
    super(name,bdyear,month,day);
    this.lap=lap;
     }
   public void submitLab(String lap){
       this.lap=lap;
   }

    public String getLap() {
        return lap;
    }
   
}
