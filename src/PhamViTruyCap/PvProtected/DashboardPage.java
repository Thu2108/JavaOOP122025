package PhamViTruyCap.PvProtected;

import PhamViTruyCap.Common.BasePage;

public class DashboardPage extends BasePage {
    // muốn kế thừa một package khác có phạm vi là Protected thì phải thêm " extends .." mà ko cần khởi tạo đối tượng class
//    C1: KẾ THỪA
//    public  void getInfoBase(){
//        System.out.println(driver);
//    }

    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();
        System.out.println(loginPage.inputEmail);
        System.out.println(loginPage.inputPassword);

// C2 KẾ THỪA
        DashboardPage dashboardPage = new DashboardPage();
//        dashboardPage.getInfoBase();
        System.out.println(dashboardPage.driver);

    }
}
