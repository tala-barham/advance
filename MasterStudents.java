/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproject1.firstproject1;

public class MasterStudents extends Student {
    private String supervisor;

    MasterStudents() {}
     
    
    public enum BAdegree{
        physics
        ,Law
        ,Engineering; 
    }
   private BAdegree stu;

    public BAdegree getStu() {
        return stu;
    }

    public void setStu(BAdegree stu) {
        this.stu = stu;
    }
   
    
      public  MasterStudents(String name,int bdyear,int month,int day,String sub,String supervisor){
        super(name,bdyear,month,day);
        this.sub=sub;
        this.supervisor=supervisor;
      } 
    public String getSupervisor() {
        return supervisor;
    }
    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }
    
}
