interface Course
{
    public void isclassfull();
    public void displayall();
    public void displayclasstime();

    public void setSubject(String subject);
    public String getSubject();


    public void setStudentEnrolled(int studentEnrolled);
    public int getStudentEnrolled();


    public void setInstructorName(String instructorName);
    public String getInstructorName();


    public void setStarttime(String starttime);
    public String getStarttime();

    public void setEndtime(String endtime);
    public String getEndtime();

    public void setStudentAllowed(int studentAllowed);
    public int getStudentAllowed();

}
