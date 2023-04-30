import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

class Student{
    private int prn;
    private String name;
    private int marks;

    //Constructor
    Student(int prn,String name,int marks)
    {
        this.prn=prn;
        this.name=name;
        this.marks=marks;
    }

    public void display(){
        System.out.println("PRN: "+prn);
        System.out.println();
        System.out.println("Marks: "+marks);
    }

    //Inbuilt function
    public String toString()
    {
        return "PRN: "+prn +"\t" + "Name: "+name +"\t"+"Marks: "+marks;
    }

}
public class lab3{
    public static void main (String[] args){

        ArrayList<Student> studentList=new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<3;i++){
            System.out.println("Enter prn of student "+i+1);
            int prn = sc.nextInt();

            System.out.println("Enter name of student with prn "+ prn);
            String name = sc.nextLine();

            System.out.println("Enter the marks of "+name);
            int marks = sc.nextInt();

            studentList.add(new Student(prn,name,marks));
        }
        studentList.add(new Student(101, "Kedar", 90));
        studentList.add(new Student(102, "K", 9));

        for (Student student:studentList)
        {
                System.out.println(student);
                //student.display();
        }
    }    
}