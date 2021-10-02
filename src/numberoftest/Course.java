package numberoftest;

public class Course {
    private  String courseId;
    private String courseName;
    private int creditHours;

    public String getCoursseId() {
        return courseId;
    }

    public void setCoursseId(String coursseId) {
        this.courseId = coursseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public Course(String coursseId, String courseName, int creditHours) {
        this.courseId = coursseId;
        this.courseName = courseName;
        this.creditHours = creditHours;
    }


}
