import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Trang", 20, "Nhân sự", 123, 5000.0));
        employees.add(new Employee(2, "Quân", 21, "Nhân sự", 124, 5000.0));
        employees.add(new Employee(3, "Hiền", 23, "Nhân sự", 125, 5000.0));
        employees.add(new Employee(4, "Trọng", 20, "Nhân sự", 126, 5000.0));
        employees.add(new Employee(5, "Nga", 25, "Nhân sự", 127, 5000.0));
        employees.add(new Employee(6, "Hoa", 23, "Nhân sự", 128, 5000.0));
        employees.add(new Employee(7, "Cúc", 21, "Nhân sự", 129, 5000.0));
        employees.add(new Employee(8, "Huyền", 20, "Nhân sự", 121, 5000.0));
        employees.add(new Employee(9, "Hồng", 22, "Nhân sự", 122, 5000.0));
        employees.add(new Employee(10, "Thắm", 25, "Nhân sự", 120, 5000.0));

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("----- Quản lý nhân viên -----");
            System.out.println("1. Hiển thị danh sách nhân viên");
            System.out.println("2. Thêm mới nhân viên");
            System.out.println("3. Xóa nhân viên");
            System.out.println("4. Thoát");
            System.out.print("Vui lòng chọn một chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Employee.displayEmployees(employees);
                    break;
                case 2:
                    Employee.addEmployee(employees, scanner);
                    break;
                case 3:
                    Employee.removeEmployee(employees, scanner);
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }

            System.out.println();
        }

        scanner.close();
    }
}