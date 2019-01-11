package com.stackroute.pe2test;
import com.stackroute.pe2main.MemberVariable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MemberVariableTest{

    MemberVariable test;

    @Before
    public void setup() throws Exception{
        test=new MemberVariable();
    }


    @Test
    public void getNameSuccess(){
        String name="Harry Potter";
        test.setName("Harry Potter");
        Assert.assertEquals(name,test.getName());

    }

    @Test
    public void getNameFail(){

        String namefail="Harry Potter";
        test.setName("Harry");
        Assert.assertNotEquals(namefail,test.getName());

    }

    @Test
    public void getSalarySuccess(){
        int salary=5000;
        test.setSalary(5000);
        Assert.assertEquals(salary,test.getSalary());

    }

    @Test
    public void getSalaryFailure(){
        int salaryfail=50000;
        test.setSalary(5000);
        Assert.assertNotEquals(salaryfail,test.getSalary());

    }

    @Test
    public void getAgeSuccess(){
        int age=30;
        test.setAge(30);
        Assert.assertEquals(age,test.getAge());
    }

    @Test
    public void getAgeFail(){
        int agefail=30;
        test.setAge(300);
        Assert.assertNotEquals(agefail,test.getAge());
    }
}