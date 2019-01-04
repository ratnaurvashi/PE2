import java.util.Scanner;

public class MemberVariable {

    public void setName(String name){

    }
    public String getName(){
        
    }

    public void setSalary(int salary){

    }
    public int getSalary(){

    }
    public void setAge(int age){

    }
    public int getAge(){

    }

    public static void main(String[] args){
        MemberVariable q = new MemberVariable();
        Scanner sc = new Scanner(System.in);
        String namei = sc.nextLine();
        q.setName(namei);
        System.out.println(q.getName());
        int salaryi = sc.nextInt();
        q.setSalary(salaryi);
        System.out.println(q.getSalary());
        int agei = sc.nextInt();
        q.setAge(agei);
        System.out.println(q.getAge());
    }
}
