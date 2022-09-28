/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproject1.firstproject1;

import java.time.LocalDate;    
import java.time.Period;  
public class Student {
    protected int id;
    protected static int count=1;
    protected String name;
    protected int month;
    protected int bdyear;
    protected int day;
    protected boolean result=true;
    protected LocalDate BirthDate;
    protected String sub;
    
    Student(String name,int bdyear,int month,int day ){
        this.id=count;
        this.name=name;
        this.bdyear=bdyear;
        this.day=day;
        this.month=month;
        count++;
    }
 
   Student(){}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
  
    public LocalDate getBirthDate() {
        return BirthDate;
    }
      public void setBirthDate(int bdyear,int month,int day) {
        this.month = month;
        this.bdyear=bdyear;
        this.day=day;
        BirthDate = LocalDate.of(bdyear, month, day);
    }
     public int calculateAge(LocalDate d){
    LocalDate curDate = LocalDate.now(); 
    return Period.between(d, curDate).getYears();  
    }  

    public int getId() {
        return id;
    }

   public void setId(int id) {
        this.id = count;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
     
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getBdyear() {
        return bdyear;
    }

    public void setBdyear(int bdyear) {
        this.bdyear = bdyear;
    }

    public String getSub() {
        return sub;
    }

    public void submitResearch(String sub) {
        this.sub = sub;
    }
    
    public boolean comp(int no,int dday,int moonth,int yeaar,String nname){
    if(no==id&&nname.equals(name)&&dday==day&&moonth==month&&yeaar==bdyear){
        result=true;
    return true;
    }
    else
    return false;
}
    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", month=" + month + ", bdyear=" + bdyear + ", day=" + day + '}';
    }

   
}
