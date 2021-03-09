package review_oop;

import java.util.ArrayList;
import java.util.Scanner;

public class EnrollStudent {
    private static String[] khoiA={"Toán","Lý","Hóa"};
    private static String[] khoiB={"Toán","Hóa","Sinh"};
    private static String[] khoiC={"Văn","Sử","Địa"};
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        Student student1=new Student(01,"Nguyễn Trung Kiên","Đà Nẵng","Có",khoiA);
        Student student2=new Student(02,"Nguyễn Công Khánh","Quảng Nam","Không",khoiB);
        studentList.add(student1);
        studentList.add(student2);

        while(true) {

            System.out.println("1.Nhập thông tin thí sinh \n" +
                    "2.Hiển thị thông tin thí sinh \n" +
                    "3.Tìm kiếm theo số báo danh \n" +
                    "4.Thoát \n" +
                    "Nhập lựa chọn :");
            Scanner scanner = new Scanner(System.in);
            int chose = Integer.parseInt(scanner.nextLine());

            switch (chose) {
                case 1:
                    addStudent(studentList, scanner);
                    break;
                case 2:
                    displayStudent(studentList);
                    break;
                case 3:
                    findStudentById(studentList, scanner);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có Lựa chọn");
                    break;
            }
        }
    }

    private static void findStudentById(ArrayList<Student> studentList, Scanner scanner) {
        System.out.println("Nhập số báo danh muốn tìm");
        int findId=Integer.parseInt(scanner.nextLine());
        for (Student student: studentList) {
            if(student.getId()==findId){
                System.out.println(student);
            }
        }
    }

    private static void displayStudent(ArrayList<Student> studentList) {
        for (Student student: studentList) {
            System.out.println(student);
        }
    }

    private static void addStudent(ArrayList<Student> studentList, Scanner scanner) {
        Student student = new Student();
        System.out.println("Nhập số báo danh :");
        int id = Integer.parseInt(scanner.nextLine());
        student.setId(id);
        System.out.println("Nhập họ và tên :");
        String name = scanner.nextLine();
        student.setName(name);
        System.out.println("Nhập địa chỉ :");
        String address = scanner.nextLine();
        student.setAddress(address);
        System.out.println("Nhập ưu tiên :");
        String priority = scanner.nextLine();
        student.getPriority(priority);
        System.out.println("Chọn khối thi :\n" +
                "1.Khối A.\n" +
                "2.Khối B.\n" +
                "3.Khối C.");
        int chose2= Integer.parseInt(scanner.nextLine());
        if(chose2==1){
            student.setExamSubject(khoiA);
        }else if(chose2==2){
            student.setExamSubject(khoiB);
        }else{
            student.setExamSubject(khoiC);
        }
        studentList.add(student);
    }
}
