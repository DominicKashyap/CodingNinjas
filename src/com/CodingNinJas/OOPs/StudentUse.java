package com.CodingNinJas.OOPs;

public class StudentUse {
    public static void main(String[] args) {
        Student obj =new Student();

        obj.name = "pankaj";
        obj.setRollNo(1);

        System.out.println(obj.getRollNo());

    }
}
