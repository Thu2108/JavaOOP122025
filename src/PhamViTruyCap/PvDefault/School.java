package PhamViTruyCap.PvDefault;

public class School {
    String email = "thunt@msb.com.vn";
    String password = "123456";

    void getAuthentication() {
        System.out.println(email);
        System.out.println(password);
    }


    public static void main(String[] args) {
        School school = new School();

    }
}
