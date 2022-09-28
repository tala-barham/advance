/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproject1.firstproject1;

import java.time.LocalDate;
import java.time.Period; 
/**
 *
 * @author AL-Aseel
 */
public class Medicalstudents extends Student {
    protected String Hospital;
public  Medicalstudents(String name,int bdyear,int month,int day,String sub,String Hospital){
    super(name,bdyear,month,day);
    this.sub=sub;
    this.Hospital=Hospital;
}
    public String getHospital() {
        return Hospital;
    }    
}
