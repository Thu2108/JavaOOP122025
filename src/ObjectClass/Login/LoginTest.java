package NewPackage.Login;

import NewPackage.Customer.CustomerTest;

public class LoginTest {
    String name="Thu test auto";

    public void testLoginSucess() {
        System.out.println("Login Success");
    }
    public void testLoginFail() {
        System.out.println("Login Fail");
    }


    public static void main(String[] args) {
        LoginTest object1=new LoginTest();
        // Logintest là class, còn loginTestabc là tên đối tượng đại diện cho class
        // nên object1 có khả năng đại diện cho class để chỉ thị 1 thành phần cụ thể như bên dưới
        object1.testLoginSucess();
        System.out.println(object1.name);


        LoginTest object2=new LoginTest();
        object2.testLoginSucess();


         // CustomerTest object1= new CustomerTest();
        // khởi tạo object đã tồn tại với một class mới là không hợp lệ
        // Mỗi một object chỉ đại diện cho 1 class

         CustomerTest object3= new CustomerTest ();


         // gọi kiểu anonymous ( gọi ẩn danh)
        new LoginTest().testLoginSucess();
    // dùng để truy xuất 1,2 thành phần nếu truy xuất nhiều thành phần thì ko nên dùng thì nó sẽ tốn bộ nhớ
         new LoginTest().testLoginFail();
    }
}
