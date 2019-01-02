import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

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
        assertEquals(name,test.getName());

    }

    @Test
    public void getNameFail(){

        String namefail="Harry Potter";
        test.setName("Harry");
        assertNotEquals(namefail,test.getName());

    }

    @Test
    public void getSalarySuccess(){
        int salary=5000;
        test.setSalary(5000);
        assertEquals(salary,test.getSalary());

    }

    @Test
    public void getSalaryFailure(){
        int salaryfail=50000;
        test.setSalary(5000);
        assertNotEquals(salaryfail,test.getSalary());

    }

    @Test
    public void getAgeSuccess(){
        int age=30;
        test.setAge(30);
        assertEquals(age,test.getAge());


    }

    @Test
    public void getAgeFail(){
        int agefail=30;
        test.setAge(300);
        assertNotEquals(agefail,test.getAge());
    }
}