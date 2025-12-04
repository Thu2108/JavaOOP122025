package baiTapVeNha.javaOop2_PackageVaPhamViTruyCap.Company;

import baiTapVeNha.javaOop2_PackageVaPhamViTruyCap.Person.Person;

public class Company {
    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.gender);

        System.out.println("--------");

        Person person1=new Person("Thu1", 30,"Female1","Thanh Hoa1","03629232881");
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.gender);


        System.out.println("--------");
        Person person2 =new Person("Thu2", 30,"Female2","Thanh Hoa2","03629232882" );
        System.out.println(person2.name);
        System.out.println(person2.age);
        System.out.println(person2.gender);



    }
}
