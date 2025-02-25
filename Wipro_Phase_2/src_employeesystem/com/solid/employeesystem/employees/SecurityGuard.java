package com.solid.employeesystem.employees;

import com.solid.employeesystem.interfaces.IEmployee;
import com.solid.employeesystem.interfaces.ISecurity;

public class SecurityGuard implements IEmployee, ISecurity {

    @Override
    public void work() {
        System.out.println("Security Guard is securing the premises.");
    }

    @Override
    public void patrol() {
        System.out.println("Security Guard is patrolling the building.");
    }
}
