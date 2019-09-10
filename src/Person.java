import java.text.StringCharacterIterator;
import java.util.Arrays;

public class Person {
    String name;
    String course;
    boolean isparttime;
    String department;
    String address;

    //constructor
    public Person(String name, boolean isparttime, String department, String course, String address)
    {
        this.name = name;
        this.isparttime=isparttime;
        this.department=department;
        this.course =course;
        this.address=address;

    }
    //get name
    public String getName() {return this.name; }
    //set name
    public void setName(String name)
    {
        this.name = name;
    }
    // get department
    public String getDepartment()
    {
        return this.department;
    }
    //set department
    public void setDepartment(String department)
    {
        this.department = department;
    }

    //get bool parttime
    public boolean getisParttime()
    {
        return isparttime;
    }
    //set is part time
    public void setisParttime (boolean isParttime)
    {
        this.isparttime=isParttime;
    }
    //get course
    public String getcourse()
    {
        return course;
    }
    //set schedule
    public void setcourse(String course)
    {
      this.course=course;
    }

    //get address
    public String getAddress()
    {
        return this.address;
    }
    //set name
    public void setAddress(String address)
    {
        this.address = address;
    }
    public boolean isFullTime(boolean isParttime)
    {
        if(isParttime== true)
        {
            System.out.println("It is not full time");
            return false;
        }
        else if (isParttime== false )
        {
            System.out.println("It is full time");
            return true;
        }
        return true;
    }



    public void printall()
    {
        System.out.println("Name is " +getName());
        isFullTime(isparttime);
        System.out.println("Department is "+getDepartment());
        System.out.println("Schedule is  "+ getcourse());
        System.out.println("Address is "+ getAddress());

    }

    void whoIam()
    {
        System.out.println("I am a Person");
        System. out. print("\n");
        System. out. print("\n");
    }







}
