public class Course {
   private String courseName;
    private String instructor;
    private float credits;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public float getCredits() {
        return credits;
    }

    public void setCredits(float credits) {
        this.credits = credits;
    }

    public Course(String courseName, String instructor, float credits) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.credits = credits;
    }
    Course(){}

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", instructor='" + instructor + '\'' +
                ", credits=" + credits +
                '}';
    }

    public void courseDetails() {
        System.out.println("Course name: " + courseName);
        System.out.println("Instructor: " + instructor);
        System.out.println("Credits: " + credits);
    }
}
