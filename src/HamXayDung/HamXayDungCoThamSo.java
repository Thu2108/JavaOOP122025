package HamXayDung;

public class HamXayDungCoThamSo {
    public String name;
    public String phone;
    public String address;

    public HamXayDungCoThamSo(String name1, String phone1) {

        // this. la thanh phan trong class do
        // ko co  this. la thanh phan ben ngoai
        // this. dc su dung khi co su trung ten o ben ngoai va ben trong class
        name = name1;
        phone = phone1;

    }

    public HamXayDungCoThamSo(String name, String phone, String address) {

        // this. la thanh phan trong class do
        // ko co  this. la thanh phan ben ngoai
        // this. dc su dung khi co su trung ten o ben ngoai va ben trong class
        this.name = name;
        this.phone=phone;
        this.address = address;

    }

    public static void main(String[] args) {
        HamXayDungCoThamSo hamXayDungCoThamSo1 = new HamXayDungCoThamSo("Thu", "0362923287");
        System.out.println(hamXayDungCoThamSo1.name);
        System.out.println(hamXayDungCoThamSo1.phone);
        System.out.println("_________");
        HamXayDungCoThamSo hamXayDungCoThamSo2 = new HamXayDungCoThamSo("Hoa", "0362923288","Thanh Hoa");
        System.out.println(hamXayDungCoThamSo2.name);
        System.out.println(hamXayDungCoThamSo2.phone);
        System.out.println(hamXayDungCoThamSo2.address);

        // cho phep cung cap nhieu bo data


    }
}
