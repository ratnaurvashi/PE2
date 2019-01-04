import java.util.Scanner;

public class MemberVariable {
    private String name;
    private int salary;
    private int age;

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
