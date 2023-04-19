import java.util.Scanner;

public class SelectionSort {
    public SelectionSort() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Введите элементы массива:");

        for(int i = 0; i < arr.length; ++i) {
            arr[i] = scanner.nextInt();
        }

        sort(arr);
        System.out.println("Отсортированный массив: ");
        int[] newArr = arr;
        int count = arr.length;

        for(int k = 0; k < count; k++) {
            int i = newArr[k];
            System.out.print("" + i + " ");
        }

    }

    public static void sort(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n - 1; ++i) {
            int min_idx = i;

            int j;
            for(j = i + 1; j < n; ++j) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            j = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = j;
        }

    }
}
