package SinhVien;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ThongTin {


    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/javaweb16";
        String username = "root";
        String password = "Hieu067067@";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            taoBang(statement);
            themSinhVien(statement);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void taoBang(Statement statement) throws SQLException {
        String createTable = "CREATE TABLE IF NOT EXISTS sinhvien (" +
                "id INT AUTO_INCREMENT PRIMARY KEY," +
                "name VARCHAR(50) UNIQUE NOT NULL," +
                "gender VARCHAR(10)," +
                "hometown VARCHAR(50)," +
                "age INT" +
                ")";
        statement.executeUpdate(createTable);
    }

    private static void themSinhVien(Statement statement) throws SQLException {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Nhập tên sinh viên (Nhấn Enter nếu muốn dừng): ");
            String name = sc.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.print("Nhập giới tính: ");
            String gender = sc.nextLine();

            System.out.print("Nhập quê quán: ");
            String hometown = sc.nextLine();

            System.out.print("Nhập tuổi: ");
            int age = sc.nextInt();
            sc.nextLine();

            String them = String.format("INSERT INTO sinhvien (name, gender, hometown, age) VALUES ('%s', '%s', '%s', %d)",
                    name, gender, hometown, age);

            try {
                statement.executeUpdate(them);
                System.out.println("Đã thêm thông tin sinh viên vào DB.");
            } catch (SQLException e) {
                System.out.println("Lỗi: " + e.getMessage());
                System.out.println("Không thể thêm thông tin sinh viên. Tên đã tồn tại hoặc dữ liệu không hợp lệ.");
            }
        }

        sc.close();
    }
}




