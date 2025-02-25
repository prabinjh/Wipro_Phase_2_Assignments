package com.solid.employeesystem.employees;

import com.solid.employeesystem.interfaces.IEmployee;
import com.solid.employeesystem.interfaces.IDeveloper;

public class Developer implements IEmployee, IDeveloper {

    @Override
    public void work() {
        System.out.println("Developer is writing code.");
    }

    @Override
    public void writeCode() {
        System.out.println("Developer is coding a new feature.");
    }
}

