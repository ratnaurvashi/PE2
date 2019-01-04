import java.util.Scanner;

public class MemberVariable {
    private String name;
    private int salary;
    private int age;

    public void setName(String namei){
        name= namei;
    }
    public String getName(){
        return name;
    }

    public void setSalary(int salaryi){
        salary=salaryi;
    }
    public int getSalary(){
        return salary;
    }
    public void setAge(int agei){
        age=agei;
    }
    public int getAge(){
        return age;
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
