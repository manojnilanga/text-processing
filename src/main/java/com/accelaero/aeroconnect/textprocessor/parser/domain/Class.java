package com.accelaero.aeroconnect.textprocessor.parser.domain;

import java.util.Collection;
import java.util.Objects;

/**
 * Created by jdziworski on 30.03.16.
 */
public class Class {
    /*private String name;
    private Collection<Method> methods;

    public Class(String name, Collection<Method> methods) {
        this.name = name;
        this.methods = methods;
    }*/

    private int employeeID;
    private String firstName;
    private String secondName;
    private String department;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Class)) return false;
        Class aClass = (Class) o;
        return employeeID == aClass.employeeID &&
                firstName.equals(aClass.firstName) &&
                secondName.equals(aClass.secondName) &&
                department.equals(aClass.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeID, firstName, secondName, department);
    }

    public Class(int employeeID, String firstName, String secondName, String department){
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.secondName = secondName;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Class{" +
                "employeeID=" + employeeID +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Class aClass = (Class) o;

        if (name != null ? !name.equals(aClass.name) : aClass.name != null) return false;
        return methods != null ? methods.equals(aClass.methods) : aClass.methods == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (methods != null ? methods.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Class{" +
                "\nname='" + name + '\'' +
                "\nmethods=" + methods +
                '}';
    }*/
}
