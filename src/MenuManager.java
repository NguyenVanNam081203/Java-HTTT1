import Model.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuManager {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();

        int counterEmployee = 10;

        // Khởi tạo 10 nhân viên
        for (int i = 0; i < 10; i++) {
            employees.add(new Employee(i, "" + i, 25 + i, "" + i, "" + i, (float)1000 + i * 100));
        }

        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("==== Menu ====");
            System.out.println("1. Hiển thị danh sách nhân viên");
            System.out.println("2. Thêm nhân viên mới");
            System.out.println("3. Xóa nhân viên");
            System.out.println("0. Thoát");
            System.out.println("-----------------------");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("==== Danh Sách Nhân viên ====");
                    for (int i = 0; i < employees.size(); i++) {
                        System.out.println("Employee ID: " + (employees.get(i).getId() + 1));
                        System.out.println("Name: " + employees.get(i).getName());
                        System.out.println("Age: " + employees.get(i).getAge());
                        System.out.println("Code: " + employees.get(i).getCode());
                        System.out.println("Department: " + employees.get(i).getDepartment());
                        System.out.println("Salary rate: " + employees.get(i).getSalaryrate());
                        System.out.println("---------------------------------");
                    }
                    System.out.println("Tổng số nhân viên: " + counterEmployee + '\n');
                    break;
                case 2:
                    System.out.print("Name: ");
                    String name = scanner.next();
                    System.out.print("Age: ");
                    int age = scanner.nextInt();
                    System.out.print("Department: ");
                    String department = scanner.next();
                    System.out.print("Code: ");
                    String code = scanner.next();
                    System.out.print("SalaryRate: ");
                    float salaryRate = scanner.nextFloat();

                    employees.add(new Employee(counterEmployee, name, age, department, code, salaryRate));
                    counterEmployee++;
                    break;
                case 3:
                    System.out.print("Nhập ID Employee cần xóa: ");
                    int id = scanner.nextInt();
                    boolean removed = false;
                    int RemoveIdEmployee = id - 1;
                    if (RemoveIdEmployee >= 0 && RemoveIdEmployee < employees.size()) {
                        employees.remove(RemoveIdEmployee);
                        counterEmployee--;
                        removed = true;
                        System.out.println("Nhân viên có ID " + id + " đã được xóa khỏi danh sách." + '\n');
                    } else {
                        System.out.println("Không tìm thấy nhân viên có ID " + id + " trong danh sách." + '\n');
                    }
                    break;
                case 0:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 0);
    }
}

