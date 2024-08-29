package edu.iuh.fit.bai1;

import java.util.Scanner;

public class TestHinhChuNhat {
    public static void main(String[] args) {
        HinhChuNhat hcn=new HinhChuNhat();
        Scanner sc=new Scanner (System.in);
        System.out.println("Nhap vao chieu dai la ");
        double chieudai=sc.nextDouble();
        hcn.setterchieudai(chieudai);
        System.out.println("Nhap vao chieu rong la ");
        double chieurong=sc.nextDouble();
        hcn.setterchieurong(chieurong);
        System.out.println(hcn.toString());
    }
}
