package PhamViTruyCap.PvPublic;

import PhamViTruyCap.Common.BasePage;
import PhamViTruyCap.PvProtected.LoginPage;

public class LoginTest {
    public static void main(String[] args) {
     ConfigData configData=new ConfigData();
        System.out.println(configData.Browser);

        // lấy data từ đối tượng PUBLIC
        LoginPage loginPage=new LoginPage();
        System.out.println(loginPage.buttonLogin);

        // dùng hàm public của package PVPublic và class Login test để dùng chung cho các package
        
        loginPage.LoginCrm();



    }
}
