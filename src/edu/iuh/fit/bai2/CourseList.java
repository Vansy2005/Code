package edu.iuh.fit.bai2;


import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class CourseList {
    private List<Course> course;
    public CourseList()
    {
        course=new ArrayList<>();
    }
    //Them 1 khóa học vào
    public void addcourse(Course newcourse)
    {
        for (Course c : course)
        {
            if(c.getterid().equals(newcourse.getterid()))
            {
                System.out.println("MÃ KHÓA HỌC ĐÃ TỒN TẠI");
                return ;
            }
        }
        course.add(newcourse);
    }
    // Lấy danh sách
    public List<Course> getcourse()
    {
        return new ArrayList<>(course);
    }
    // Xóa 1 khóa học
    public void removecourse(String courseID)
    {
        for (Course c : course)
        {
            if (c.getterid().equals(courseID))
            {
                course.remove(c);
                return ;
            }
        }
        System.out.println("Ma khoa hoc khong ton tai");
    }
    public Course timkiemkhoahoc(String courseID)
    {
        for (Course c : course)
        {
            if(c.getterid().equals(courseID))
            {
                return c;
            }
        }
        return null;
    }
    public List<Course> timkiemtenkhoahoc(String coursename)
    {
        List<Course> result =new ArrayList<>();
        for(Course c : course)
        {
            if(c.gettertenkhoahoc().toLowerCase().contains(coursename.toLowerCase()))
            {
                result.add(c);
            }

        }
        return result.isEmpty() ? null : result;
    }
    public List<Course> timkiemtenkhoa(String coursenamekhoa)
    {
        List<Course> requit = new ArrayList<>();
        for (Course c : course)
        {

            if(c.getterkhoaphutrach().toLowerCase().contains(coursenamekhoa.toLowerCase()))
            {
                requit.add(c);
            }

        }
        return requit.isEmpty() ? null : requit;
    }
    public List<Course> sapxepkhoahoc (String sapxepkhoahoc)
    {
        List<Course> sapxep=new ArrayList<>(course);
        Collections.sort(sapxep,Comparator.comparing(Course::gettertenkhoahoc));
        return sapxep;

    }
    public List<Course> khoahoccotinchimax()
    {
        OptionalInt maxtinchi= course.stream().mapToInt(Course::gettersotinchi).max();
        {
            return maxtinchi.isPresent() ?
                    course.stream()
                            .filter(c -> c.gettersotinchi() == maxtinchi.getAsInt())
                            .collect(Collectors.toList()): new ArrayList<>();

        }

    }
    public String timKhoaPhuTrachNhieuKhoaHocNhat() {
        return course.stream()
                .collect(Collectors.groupingBy(Course::getterkhoaphutrach, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }

}
	
	

 