/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Date;

/**
 *
 * @author Estudiante
 */
public abstract class Professor extends Employee {
    
    private String school;
    private String department;
    
    public Professor(String id, String name, Date hiringDate,String school,String department) {
        super(id, name, hiringDate);
        this.school=school;
        this.department=department;
    }

   
    
    
}
