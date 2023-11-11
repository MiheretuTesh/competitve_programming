package Java.Sorting;

class BubbleSorting {
    static void sorting(int[] arr) {
        int size = arr.length;

        int i, j, temp;
        boolean swapped;

        for (i = 0; i < size; i++) {
            swapped = false;
            for (j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
    }

    static void printArray(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 100, 80, 90, 20, 4, 32, 22 };
        int n = arr.length;

        sorting(arr);

        System.out.println("Array Sorted");
        printArray(arr, n);

    }
}
