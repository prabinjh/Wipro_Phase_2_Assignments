package com.solid.employeesystem.employees;

import com.solid.employeesystem.interfaces.IEmployee;
import com.solid.employeesystem.interfaces.IManager;

public class Manager implements IEmployee, IManager {

    @Override
    public void work() {
        System.out.println("Manager is overseeing the team.");
    }

    @Override
    public void conductMeeting() {
        System.out.println("Manager is conducting a meeting.");
    }
}
