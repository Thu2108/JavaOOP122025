package baiTapVeNha.javaOop2_PackageVaPhamViTruyCap.Person;
//BÀI TẬP PHẦN PACKAGE VÀ PHẠM VI TRUY CẬP
//
//- Tại package "person" :
//        + Tạo class "Person" với các thông tin: name, age, gender, address, phone
//	+ Hàm xây dựng và hàm get tương ứng để giải quyết bài toán theo yêu cầu
//	+ Tạo class "Information" để gọi lại tất cả các thông tin từ class Person
//
//- Tại package "company" :
//Yêu cầu:	+ Tạo class "Company" để gọi lại thông tin từ class Person: name, age, gender.
// Còn lại các thông tin khác không được hiển thị ra.

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;

public class Person {
    public String name;
    public int age;
    public String gender;
    private String address;
    private String phone;
// ham xay dung khong co tham so

    public Person(){
       name="THU";
       age=30;
       gender= "Female";
       address="Thanh Hoa";
       phone="0362923288";

    }

    // ham xay dung co tham so
    public Person(String name1,int age1,String gender1,String address1,String phone1){
        this.name=name1;
        this.age=age1;
        this.gender=gender1;
        this.address=address1;
        this.phone=phone1;


    }

    public static void main(String[] args) {
        // goi doi tuong class
        Person person=new Person();
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.gender);
        System.out.println(person.address);
        System.out.println(person.phone);
        System.out.println("--------");

        Person person1=new Person("Thu1", 30,"Female1","Thanh Hoa1","03629232881" );
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.gender);
        System.out.println(person1.address);
        System.out.println(person1.phone);






    }
}
