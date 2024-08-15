import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<OnlineCourse>  onlinecourses = new ArrayList<>();

        OnlineCourse onlinecourse1= new OnlineCourse("Advanced Java Programming", "Jane Smith", 3, "Udemy", 12);
        OnlineCourse onlinecourse2= new OnlineCourse("Advanced Python Programming", "David Harry", 7.5f, "Udemy", 9);
        OnlineCourse onlinecourse3 = new OnlineCourse("Introduction to Java", "John Doe", 4,"UpCourse",5);
        OnlineCourse onlinecourse4 = new OnlineCourse("Introduction to Python", "Kim Berly", 5.5f,"Upcourse",14);

        onlinecourses.add(onlinecourse1);
        onlinecourses.add(onlinecourse2);
        onlinecourses.add(onlinecourse3);
        onlinecourses.add(onlinecourse4);

        for (OnlineCourse onlineCourse: onlinecourses) {

            System.out.println("The online Course Details are --->\n");

            onlineCourse.courseDetails();
            onlineCourse.certificateEligibility();
            System.out.println();
        }
    }
}