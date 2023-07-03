package SapXep;

public class Sort {

    public static void insertionSort(int a[]) {
        for (int i = 1; i < a.length; i++) {
            int nho = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > nho) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = nho;
        }
    }

    public static void selectionSort(int a[]) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }
            int so = a[i];
            a[i] = a[min];
            a[min] = so;
        }

    }

    public static void bubbleSort(int a[]) {
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    int so = a[i];
                    a[i] = a[j];
                    a[j] = so;
                }
            }
        }
    }

    public static void hienThi(int a[]) {

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a[] = { 3, 5, 89, 75, 63 };
        System.out.println("Mảng ban đầu:");
        hienThi(a);
        Sort s = new Sort();
        s.bubbleSort(a);
        System.out.println("Mảng sau khi sắp xếp:");
        hienThi(a);
    }
}
