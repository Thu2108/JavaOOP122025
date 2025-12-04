package baiTapVeNha.javaOop2_PackageVaPhamViTruyCap.Person;

public class Information {
    public static void main(String[] args) {

        Person person = new Person() ;
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.gender);
//        System.out.println(person.address);
//        System.out.println(person.phone);

        System.out.println("-------");
        Person person1=new Person("Thu1", 30,"Female1","Thanh Hoa1","03629232881" );
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.gender);

    }
}
