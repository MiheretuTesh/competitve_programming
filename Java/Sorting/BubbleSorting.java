package Java.Sorting;

class BubbleSorting {
    static int[] sorting(int[] arr) {
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
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
