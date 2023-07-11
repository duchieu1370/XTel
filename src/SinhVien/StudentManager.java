package SinhVien;

import java.util.List;
import java.util.Scanner;

public class StudentManager {
    public static Scanner scanner = new Scanner(System.in);
    private final List<Student> studentList;
    private final StudentDao studentDao;

    /**
     * init StudentDao object and
     * read list student when init StudentManager object
     */
    public StudentManager() {
        studentDao = new StudentDao();
        studentList = studentDao.read();
    }


    public void add() {
        int id = (studentList.size() > 0) ? (studentList.size() + 1) : 1;
        System.out.println("student id = " + id);
        String name = inputName();
        if (studentList.contains(name)) {
            System.out.println("Tên sinh vien đã có trong danh sach.");
        } else{
            String gioiTinh = inputGioiTinh();
            byte age = inputAge();
            String queQuan = inputQueQuan();
            Student student = new Student(id, name, gioiTinh , age, queQuan);
            studentList.add(student);
            studentDao.write(studentList);
        }
    }


    public void edit(int id) {
        boolean isExisted = false;
//        int size = studentList.size();
        for (Student student : studentList) {
            if (student.getId() == id) {
                isExisted = true;
                student.setTen(inputName());
                student.setGioiTinh(inputGioiTinh());
                student.setTuoi(inputAge());
                student.setQueQuan(inputQueQuan());
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("id = %d not existed.\n", id);
        } else {
            studentDao.write(studentList);
        }
    }

    public void timKiem(int id){
        boolean isExist = false;
        for (Student student : studentList){
            if (student.getId() == id){
                isExist = true;
                System.out.format(id + " %20s | " , student.getTen());
                System.out.format("%5d | " , student.getTuoi());
                System.out.format("%5s | " , student.getGioiTinh());
                System.out.format("%20s | %n" , student.getQueQuan());
                break;
            }
        }
        if (!isExist) {
            System.out.printf("id = %d not existed.\n", id);
        } else {
            studentDao.write(studentList);
        }
    }


    public void delete(int id) {
        Student student = null;
//        int size = studentList.size();
        for (Student value : studentList) {
            if (value.getId() == id) {
                student = value;
                break;
            }
        }
        if (student != null) {
            studentList.remove(student);
            studentDao.write(studentList);
        } else {
            System.out.printf("id = %d not existed.\n", id);
        }
    }

    public void show() {
        for (Student student : studentList) {
            System.out.format("%5d | ", student.getId());
            System.out.format("%20s | ", student.getTen());
            System.out.format("%5d | ", student.getTuoi());
            System.out.format("%5s | ", student.getGioiTinh());
            System.out.format("%20s | %n", student.getQueQuan());
        }
    }


    public int inputId() {
        System.out.print("Input student id: ");
        while (true) {
            try {
                return Integer.parseInt((scanner.nextLine()));
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input student id again: ");
            }
        }
    }


    private String inputName() {
        System.out.print("Input student name: ");
        return scanner.nextLine();
    }

    private String inputGioiTinh() {
        System.out.print("Input student gioi tinh: ");
        return scanner.nextLine();
    }

    private String inputQueQuan() {
        System.out.print("Input student que quan: ");
        return scanner.nextLine();
    }

    private byte inputAge() {
        System.out.print("Input student tuoi: ");
        while (true) {
            try {
                byte age = Byte.parseByte((scanner.nextLine()));
                if (age < 0 && age > 100) {
                    throw new NumberFormatException();
                }
                return age;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input student id again: ");
            }
        }
    }

}
