class English implements Course {
    String subject;
    int studentEnrolled;
    String instructorName;
    String starttime;
    String endtime;
    int studentAllowed;

    English(String subject, int studentEnrolled,String instructorName,String starttime,String endtime, int studentAllowed)
    {
        this.subject=subject;
        this.studentEnrolled=studentEnrolled;
        this.instructorName=instructorName;
        this.starttime=starttime;
        this.endtime=endtime;
        this.studentAllowed=studentAllowed;
    }
    @Override
    public void isclassfull( ){
        if (studentEnrolled<studentAllowed)
        {
            System.out.println("class not full ");
        }
        else
        {
            System.out.println("class full ");
        }
    }

    @Override
    public void displayall()
    {
        System.out.println("Name is " +getSubject());
        isclassfull();
        System.out.println("number of students enrolled "+getStudentEnrolled());
        System.out.println("Instructor is "+getInstructorName());
        System.out.println("Class starts at  "+ getStarttime());
        System.out.println("Class ends at "+ getEndtime());
        System.out.println("number of students allowed "+getStudentAllowed());

    }

    @Override
    public void displayclasstime()
    {
        System.out.println("Class starts at " + starttime +" Ends at "+ endtime);
        System. out. print("\n");
        System. out. print("\n");
    }

    @Override
    public void setSubject(String subject) {
        this.subject=subject;
    }

    @Override
    public String getSubject() {
        return this.subject;
    }

    @Override
    public void setStudentEnrolled(int studentEnrolled) {
        this.studentEnrolled=studentEnrolled;
    }

    @Override
    public int getStudentEnrolled() {
        return this.studentEnrolled;
    }

    @Override
    public void setInstructorName(String instructorName) {
        this.instructorName=instructorName;
    }

    @Override
    public String getInstructorName() {
        return this.instructorName;
    }

    @Override
    public void setStarttime(String starttime) {
        this.starttime=starttime;
    }

    @Override
    public String getStarttime() {
        return this.starttime;
    }

    @Override
    public void setEndtime(String endtime) {
        this.endtime=endtime;
    }

    @Override
    public String getEndtime() {
        return this.endtime;
    }

    @Override
    public void setStudentAllowed(int studentAllowed) {
        this.studentEnrolled=studentAllowed;
    }

    @Override
    public int getStudentAllowed() {
        return studentAllowed;
    }

    @Override
    public String toString() {
        return "English{" +
                "subject='" + subject + '\'' +
                ", studentEnrolled=" + studentEnrolled +
                ", instructorName='" + instructorName + '\'' +
                ", starttime='" + starttime + '\'' +
                ", endtime='" + endtime + '\'' +
                ", studentAllowed=" + studentAllowed +
                '}';
    }
}
