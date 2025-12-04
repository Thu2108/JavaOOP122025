package PhamViTruyCap.PvPrivate;

public class Employee {

    private String name = "Thu Nguyen";
    private  int age = 30;

    private void getInfo() {
        System.out.println("Nhan vien:" + name);
        System.out.println(age+ " tuoi");
    }
private void getName(){
    System.out.println(name);
}
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.getInfo();

    }
}
