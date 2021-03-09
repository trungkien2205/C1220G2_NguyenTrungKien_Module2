package review_oop;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleTest {
    public static void main(String[] args) {
        ArrayList<Vehicle> carList = new ArrayList<>();
        Vehicle car1 = new Vehicle("Air Black", 150, 2000);
        Vehicle car2 = new Vehicle("SH", 150, 4000);
        Vehicle car3 = new Vehicle("Suzuki", 400, 10000);
        Vehicle car4 = new Vehicle("Super Cup", 50, 1000);
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);

        System.out.println("1.Tạo các đối tượng và nhập thông tin \n" +
                "2.Xuất bản kê khai tiền thuế của các xe. \n" +
                "3.Thoát");
        Scanner scanner = new Scanner(System.in);
        int chose = Integer.parseInt(scanner.nextLine());
        switch (chose) {
            case 1:
                System.out.println("Nhập tên xe");
                String name = scanner.nextLine();
                System.out.println("Nhập dung tích xylanh:");
                int capa = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập giá ");
                double price = Integer.parseInt(scanner.nextLine());
                Vehicle myCar = new Vehicle(name, capa, price);
                carList.add((myCar));
                break;
            case 2:
                for (Vehicle car : carList) {
                    System.out.println(car.getCar() + " :" +
                            car.calTax(car.getCapacity(), car.getPrice()));
                }
                break;
            case 3:
                break;

        }
    }
}
