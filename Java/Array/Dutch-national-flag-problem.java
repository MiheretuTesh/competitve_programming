import java.io.*;

class countzot {
    static int[] sortcolors(int a[], int arr_size) {
        int low = 0;
        int high = arr_size - 1;
        int mid = 0, temp = 0;

        while (mid <= high) {
            switch (a[mid]) {
                case 0: {
                    temp = a[low];
                    a[low] = a[mid];
                    a[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    temp = a[mid];
                    a[mid] = a[high];
                    a[high] = temp;
                    high--;
                    break;
                }
            }
        }

        for (int i = 0; i < arr_size; i++) {
            System.out.println(a[i]);
        }

        return a;
    }

    static void printArray(int arr[], int arr_size) {
        int i;
        for (i = 0; i < arr_size; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int arr_size = arr.length;
        int[] value = sortcolors(arr, arr_size);
        printArray(value, arr_size);
    }
}