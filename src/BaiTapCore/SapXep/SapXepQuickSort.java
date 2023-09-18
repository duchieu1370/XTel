package BaiTapCore.SapXep;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SapXepQuickSort {

    public static void main(String[] args) {
        int[] arr = readArrayFromFile("D:\\Working\\xTel\\OnTap\\index.txt");

        System.out.println("Mảng trước khi sắp xếp:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
    }

    private static int[] readArrayFromFile(String fileName) {
        try {
            File file = new File(fileName);
            Scanner sc = new Scanner(file);
            String data = sc.nextLine();
            String[] a = data.split("\\s+");

            int[] arr = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                arr[i] = Integer.parseInt(a[i]);
            }

            sc.close();
            return arr;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return new int[0];
        }
    }

    private static void quickSort(int[] arr, int i, int j) {
        if (i < j) {
            int pivotIndex = partition(arr, i, j);
            quickSort(arr, i, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, j);
        }
    }

    private static int partition(int[] arr, int a, int b) {
        int p = arr[b];
        int i = a - 1;

        for (int j = a; j < b; j++) {
            if (arr[j] <= p) {
                i++;
                hoanVi(arr, i, j);
            }
        }
        hoanVi(arr, i + 1, b);
        return i + 1;
    }

    private static void hoanVi(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

}
