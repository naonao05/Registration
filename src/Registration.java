import sun.security.krb5.internal.crypto.Aes128;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.lang.String;

public class Registration {
    public static void main(String[] args) throws IOException {
        Student[] studentArray = new Student[5];
        Course[] courses = new Course[5];

        courses[0]= new Math("Math 1003", 10,"John", "10:30AM","11:45AM",20);
        courses[1]= new English("CSCE 1001", 14,"Ryan", "11:30AM","12:45AM",20);
        courses[2]= new Math("Math 1002", 50,"Jesus", "8:30AM","9:45AM",43);
        courses[3]= new English("English 1003", 20,"Chris", "1:30PM","2:45AM",21);
        courses[4]= new Math("Math 1004", 30,"Lincoln", "9:30AM","10:45AM",20);






        System.out.println("Test"+ courses[0].toString());

        String[] classArray = new String[5];
        for (int i =0; i<studentArray.length;i++)
        {
            classArray[i] = courses[i].toString();

        }



        studentArray[0] = new Student("John",true,"computer Science",classArray[1]+classArray[2]+classArray[3],"123 School AVE","Junior");
        studentArray[1] = new Student("Jesus",false,"Music",classArray[1]+classArray[2],"543 Crossover Road","Senior");
        studentArray[2] = new Student("Ryan",true,"computer Science",classArray[1],"123 School AVE","senior");
        studentArray[3] = new Student("Kevin",false,"Business ",classArray[1],"543 Crossover Road","senior");
        studentArray[4] = new Student("Chris",true,"Art",classArray[1],"123 School AVE","senior");

        for (int i = 0; i < studentArray.length; i++) {
            studentArray[i].printall();
            studentArray[i].whoIam();
        }

        Insturctor[]insturctorsArray = new Insturctor[5];
        insturctorsArray[0] = new Insturctor("John",false,"computer science,",classArray[1],"123 dickson ave","Math",13,"BS of Engineering", 70000);
        insturctorsArray[1] = new Insturctor("Ryan",false,"Business,",classArray[1],"123 School ave","Math",3,"BS of Computer Science", 60000);
        insturctorsArray[2] = new Insturctor("Jesus",true,"Math,",classArray[2],"123 College ave","Math",5,"BS of MATH", 64000);
        insturctorsArray[3] = new Insturctor("Altaf",false,"computer science,",classArray[3],"123 Harmon ave","Math",1,"BS of Computer Science", 62000);
        insturctorsArray[4] = new Insturctor("Ram",true,"Art,",classArray[3],"123 dickson ave","Math",7,"BS of Computer Science", 45000);

        for (int i = 0; i < studentArray.length; i++) {
            insturctorsArray[i].printall();
            insturctorsArray[i].whoIam();
        }

        insturctorsArray[1].displayDegree();
        insturctorsArray[1].givearaise();

        int counter =1;
        PrintWriter pr = new PrintWriter("text.txt");
        for (int i=0; i<studentArray.length ; i++)
        {


            pr.print("Student " + counter+ ", ");
            pr.print("Name is " + studentArray[i].name+", ");
            if (studentArray[i].isFullTime(studentArray[i].isparttime==true))
            {
                pr.print("it is full time, ");
            }
            else{
                pr.print("it not full time, ");
            }
            pr.print("Department is " + studentArray[i].department+", ");
            pr.print("Course is " + studentArray[i].course+", ");
            pr.print("Address is "+ studentArray[i].address+", ");
            pr.println("Year is " + studentArray[i].year+"/ ");
            pr.println("-------------------------------------------------------------------------------");
            counter++;
        }
        pr.close();




        for (int i = 0; i < studentArray.length; i++) {
            courses[i].displayall();
            courses[i].isclassfull();
            courses[i].displayclasstime();
        }

       //gi studentArray.

    }
}
