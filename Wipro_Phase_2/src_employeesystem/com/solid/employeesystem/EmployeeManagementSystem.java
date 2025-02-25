package com.solid.employeesystem;

import com.solid.employeesystem.employees.Manager;
import com.solid.employeesystem.employees.Developer;
import com.solid.employeesystem.employees.SecurityGuard;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Developer developer = new Developer();
        SecurityGuard securityGuard = new SecurityGuard();

        // Performing actions
        System.out.println("=== Employee Management System ===");
        
        manager.work();
        manager.conductMeeting();
        
        developer.work();
        developer.writeCode();
        
        securityGuard.work();
        securityGuard.patrol();
    }
}
