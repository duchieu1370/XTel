package BaiTapCore.Mang;

public class TimKiemMotPhanTu {

    public static void main(String[] args) {
        int[] arr = {1, 7, 5, 6, 2, 9, 8, -1};
        int x = 5;
        int viTri = timKiem(arr, x);
        if (viTri == -1) {
            System.out.println("Khong tim thay");
        } else {
            System.out.println("Tim thay tai vi tri: " + viTri);
        }
    }

    static int timKiem(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
}
