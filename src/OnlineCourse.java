public class OnlineCourse extends Course{
    String platform;
    float duration;

    public OnlineCourse(String courseName, String instructor, float credits, String platform, float duration) {
        super(courseName, instructor, credits);
        this.platform = platform;
        this.duration = duration;
    }

    @Override
    public void courseDetails(){
        super.courseDetails();
        System.out.println("Platform: "+ platform);
        System.out.println("duration: "+ duration);
    }

    public void certificateEligibility(){
        if (duration >= 10){
            System.out.println(getCourseName() +" is eligible for Certification");
        } else {
            System.out.println(getCourseName() +" is not eligible for Certification");
        }
    }
}
