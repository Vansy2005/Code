package edu.iuh.fit.bai2;

import java.util.List;
import java.util.Scanner;

public class TestCourse {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        CourseList courseList = new CourseList();

        // Thêm khóa học
        System.out.println("Nhập thông tin khóa học:");
        System.out.print("ID: ");
        String id = scr.nextLine();
        System.out.print("Tên khóa học: ");
        String tenkhoahoc = scr.nextLine();
        System.out.print("Khoa phụ trách: ");
        String khoaphutrach = scr.nextLine();
        System.out.print("Số tín chỉ: ");
        int sotinchi = Integer.parseInt(scr.nextLine());

        Course newCourse = new Course(sotinchi, khoaphutrach, id, tenkhoahoc);
        courseList.addcourse(newCourse);

        // Hiển thị danh sách khóa học
        System.out.println("Danh sách khóa học:");
        List<Course> courses = courseList.getcourse();
        for (Course course : courses) {
            System.out.println(course);
        }

        // Tìm kiếm khóa học theo ID
        System.out.print("Nhập ID khóa học để tìm kiếm: ");
        String searchID = scr.nextLine();
        Course foundCourse = courseList.timkiemkhoahoc(searchID);
        if (foundCourse != null) {
            System.out.println("Khóa học tìm thấy: " + foundCourse);
        } else {
            System.out.println("Khóa học không tồn tại.");
        }

        // Tìm kiếm khóa học theo tên khóa học
        System.out.print("Nhập tên khóa học để tìm kiếm: ");
        String searchName = scr.nextLine();
        List<Course> coursesByName = courseList.timkiemtenkhoahoc(searchName);
        if (coursesByName != null && !coursesByName.isEmpty()) {
            System.out.println("Các khóa học tìm thấy:");
            for (Course course : coursesByName) {
                System.out.println(course);
            }
        } else {
            System.out.println("Không tìm thấy khóa học nào.");
        }

        // Tìm kiếm khóa học theo khoa phụ trách
        System.out.print("Nhập tên khoa phụ trách để tìm kiếm: ");
        String searchKhoa = scr.nextLine();
        List<Course> coursesByKhoa = courseList.timkiemtenkhoa(searchKhoa);
        if (coursesByKhoa != null && !coursesByKhoa.isEmpty()) {
            System.out.println("Các khóa học tìm thấy:");
            for (Course course : coursesByKhoa) {
                System.out.println(course);
            }
        } else {
            System.out.println("Không tìm thấy khóa học nào.");
        }

        // Sắp xếp khóa học theo tên
        List<Course> sortedCourses = courseList.sapxepkhoahoc("tenkhoahoc");
        System.out.println("Khóa học sau khi sắp xếp theo tên:");
        for (Course course : sortedCourses) {
            System.out.println(course);
        }

        // Tìm khóa học có số tín chỉ lớn nhất
        List<Course> maxCreditCourses = courseList.khoahoccotinchimax();
        System.out.println("Khóa học có số tín chỉ lớn nhất:");
        for (Course course : maxCreditCourses) {
            System.out.println(course);
        }

        // Tìm khoa phụ trách có nhiều khóa học nhất
        String mostResponsibleDept = courseList.timKhoaPhuTrachNhieuKhoaHocNhat();
        System.out.println("Khoa phụ trách có nhiều khóa học nhất: " + mostResponsibleDept);

        scr.close();
    }
}
