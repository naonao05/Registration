class Student extends Person {

    String year;
    //Constructor
    public Student(String name, boolean isparttime, String department, String course, String address, String year)
    {
        super(name, isparttime, department, course, address);
        this.year=year;
    }




    //get year
    public String getYear()
    {
        return this.year;
    }
    //set year
    public void setYear(String year)
    {
        this.year = year;
    }
    public String enroll(String currentclass, String classtoAdd)
    {
        String finalString = currentclass+" " + classtoAdd;
        return finalString;
    }

    public void dropClasss()
    {

    }

    @Override
    void whoIam()
    {
        System.out.println("I am a Student");
        System. out. print("\n");
        System. out. print("\n");
    }

    @Override
    public void printall()
    {
        super.printall();
        System.out.println("Year is "+ getYear());
    }









}
