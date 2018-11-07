import java.util.*;
import java.io.*;

public class CourseManip{

  protected ArrayList<Course> courseList;
  protected ArrayList<StudentCourse> studCourseList;
  protected StudentDetails studDet;

  public boolean check(String file){
    String filename = "../FILES/" + file;
    File f = new File(filename);
    
    if(f.exists()){
      return true;
    }
    return false;
  }

  public boolean getCourses(){
    if(StudentDetails.check(studDet) == true){
      if(check(studDet.getRollno()) == true){
        studCourseList = StudentCourse.get(studDet.getRollno());
        return true;
      }
      else{
        studCourseList = new ArrayList<StudentCourse>();
        return true;
      }
    }
    else{
      System.out.println("There is no such student in the database. Please add a student");
      return false;
    }
  }
}
