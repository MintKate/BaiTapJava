import java.util.Scanner;
import java.util.ArrayList;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String department;
    private int code;
    private double salary_rate;

    public Employee(int id, String name, int age, String department, int code, double salary_rate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.code = code;
        this.salary_rate = salary_rate;
    }

    public Employee() {
        super();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public int getCode() {
        return code;
    }

    public double getSalary_rate() {
        return salary_rate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setSalary_rate(double salary_rate) {
        this.salary_rate = salary_rate;
    }
    @Override
    public String toString(){
        return "ID: " + id + ", Name: "+name+", Age: "+
                age+", Department: "+department+", Code: "+code+
                ", Salary Rate: "+salary_rate;
    }

    // Phương thức hiển thị danh sách nhân viên
    public static void displayEmployees(ArrayList<Employee> employees) {
        if (employees.isEmpty()) {
            System.out.println("Danh sách nhân viên trống.");
        } else {
            System.out.println("Danh sách nhân viên:");
            for (Employee employee : employees) {
                System.out.println(employee.toString());
            }
        }
    }

    // Phương thức thêm mới nhân viên
    public static void addEmployee(ArrayList<Employee> employees, Scanner scanner) {
        System.out.print("Nhập ID nhân viên: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập tên nhân viên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập tuổi nhân viên: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập phòng ban nhân viên: ");
        String department = scanner.nextLine();
        System.out.print("Nhập code nhân viên: ");
        int code = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập lương nhân viên: ");
        double salary_rate = scanner.nextDouble();
        scanner.nextLine();

        Employee newEmployee = new Employee(id, name, age, department, code, salary_rate);
        employees.add(newEmployee);
        System.out.println();
        System.out.println("Thêm mới nhân viên thành công.");
    }

    // Phương thức xóa nhân viên
    public static void removeEmployee(ArrayList<Employee> employees, Scanner scanner) {
        System.out.print("Nhập ID nhân viên cần xóa: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        boolean found = false;
        Employee foundEmployee = null;
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                foundEmployee = employee;
                found = true;
                break;
            }
        }

        if (found) {
            employees.remove(foundEmployee);
            System.out.println("Xóa nhân viên thành công.");
        } else {
            System.out.println("Không tìm thấy nhân viên với ID đã nhập.");
        }
    }
}
