package BaiTapCore.Mang;

public class ThemMotPhanTu {

    public static void main(String[] args) {
        int size = 20; // Suc chua cua mang
        int[] arr = new int[size];
        arr[0] = 1;
        arr[1] = -1;
        arr[2] = 6;
        arr[3] = 5;
        arr[4] = 3;
        int n = 5; // So luong phan tu trong mang hien tai
        int x = 10;

        System.out.print("Truoc khi them: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        // Inserting key
        n = insert(arr, size, n, x);

        System.out.print("\nSau khi them: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

    }

    static int insert(int[] arr, int size, int n, int x) {
        // Neu so luong phan tu lon hon hoac bang suc chua cua mang thi khong the them
        if (n >= size) {
            return n;
        }
        // them X vao vi tri cuoi cua mang
        arr[5] = x;
        return n + 1; // tang so luong phan tu cua mang them 1
    }

    static int insertToPos(int[] arr, int size, int n, int x, int postision) {
        // Neu so luong phan tu lon hon hoac bang suc chua cua mang thi khong the them
        if (n >= size) {
            return n;
        }
        // vi tri them phan tu phai thuoc khoang[0, n]
        if (postision < 0 || postision > n) {
            return n;
        }

        for (int i = n; i > postision; i--) {
            arr[i] = arr[i - 1];
        }
        // them X vao vi tri postision cua mang
        arr[postision] = x;
        return n + 1; // tang so luong phan tu cua mang them 1
    }

}
