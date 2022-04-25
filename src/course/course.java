package course;

public class course
{
    public static void main(String[] args)
    {
        classcourses course=new classcourses(11);
        course course2 = new course();
        course course3 = new course();
    }
}


class classcourses
{
    private int courseID;
    private String courseName;
    private int courseNumber;


    public void setcourseID(int courseID)
    {
        this.courseID = courseID;
    }

    public int getcourseID(int courseID)
    {
        return courseID;
    }

    public void setcourseName(String courseName)
    {
        this.courseName = courseName;
    }

    public String getcourseName(String courseName)
    {
        return courseName;
    }

    public void setCourseNumber(int courseNumber)
    {
        this.courseNumber = courseNumber;
    }

    public int getCourseNumber(int courseNumber)
    {
        return courseNumber;
    }

    classcourses(int courseID)
    {
        this.courseID = courseID;
    }

    classcourses(int courseID,String courseName)
    {
        this.courseID = courseID;
        this.courseName = courseName;
    }

    classcourses(int courseID,String courseName,int courseNumber)
    {
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }
}


