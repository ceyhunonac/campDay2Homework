public class Course {

    public Course(){
        System.out.println("Constructor code is working");
    }
    public Course(int id,String courseName,double progressPercentage,String instructor){
        this();
        this.id =id;
        this.courseName = courseName;
        this.progressPercentage = progressPercentage;
        this.instructor = instructor;
    }
    int id;
    String courseName;
    String instructor;
    double progressPercentage;
}
