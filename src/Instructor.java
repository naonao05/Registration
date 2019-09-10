class Insturctor extends Person {

    String Coursetaught;
    int yearofTeaching;
    String degreeInformation;
    double salary;


    public Insturctor(String name, boolean isparttime, String department, String course, String address, String Coursetaught, int yearofTeaching, String degreeInformation, double salary)
    {
        super(name, isparttime, department, course, address);
        this.Coursetaught=Coursetaught;
        this.yearofTeaching=yearofTeaching;
        this.degreeInformation=degreeInformation;
        this.salary=salary;
    }

    public String getCourseTough()
    {
        return this.Coursetaught;
    }
    //set coursetough
    public void setCourseTough(String courseTough)
    {
        this.Coursetaught = Coursetaught;
    }


    public int  getYearofTeaching()
    {
        return this.yearofTeaching;
    }
    //set coursetough
    public void getYearofTraching(int yearofTeaching)
    {
        this.yearofTeaching = yearofTeaching;
    }


    public double getSalary()
    {
        return this.salary;
    }
    //set coursetough
    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public String getdegreeInformation()
    {
        return this.degreeInformation;
    }
    //set coursetough
    public void setdegreeInformation(String  degreeInformation)
    {
        this.degreeInformation = degreeInformation;
    }

    public void displayDegree()
    {
        System.out.println(getdegreeInformation());
    }
    public void givearaise()
    {
        if (salary<=60000) {
            System.out.println("give raise to 65000");
            setSalary(65000);
        }
        else if( salary>60000)
        {
            System.out.println("no raise");
        }
    }







    @Override
    void whoIam()
    {
        System.out.println("I am a professor");
        System. out. print("\n");
        System. out. print("\n");
    }

    @Override
    public void printall()
    {
        super.printall();
        System.out.println("course taugh is "+ getCourseTough());
        System.out.println("Year of Teaching is "+ getYearofTeaching());
        System.out.println("Degree is "+ getdegreeInformation());
        System.out.println("salary  is "+ getSalary());
    }








}
