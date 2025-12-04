package HamXayDung;

public class DemoHamXayDung {

    // Ham xay dung co ten ham giong ten class
    // y nghia dung de
    public  String name;
    public  String phone;
    public static  String address="Tho Khang, Thang Tho, Nong Cong, Thanh Hoa";;

    public DemoHamXayDung(){

        // ham xay dung la ham ko tra ve, ko co  void, ten ham giong ten class
        // khoi tao gia tri cho cac bien khi ma khoi tao dtuong class

        name="Nhung";
        phone="0362923276";
        // address="Tho Khang, Thang Tho, Nong Cong, Thanh Hoa";
        // khoi tao doi tuong class

    }

    public static void main(String[] args) {

        // khoi tao doi tuong class thi no da chay ham xahy dung luon
         DemoHamXayDung demoHamXayDung=new DemoHamXayDung();
        System.out.println(demoHamXayDung.name);
        System.out.println(demoHamXayDung.phone);
    }}

