package com.stackroute.pe2main;

public class MemberVariable {
    //properties of member variable class
    private String name;
    private int salary;
    private int age;

    //getters and setters for member variable class
    public void setName(String name){
        name=this.name;
    }
    public String getName(){
        return this.name;
    }

    public void setSalary(int salary){
        salary=this.salary;
    }
    public int getSalary(){
        return this.salary;
    }

    public void setAge(int age){
        age=this.age;
    }
    public int getAge(){
        return this.age;
    }
}
