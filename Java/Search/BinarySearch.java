package Java.Search;

class BinarySearch {
    static int search(int[] arr, int target, int low, int mid, int high, int size) {
        for (int i = 0; i < size; i++) {
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                high = mid;
                mid = low + (high - low) / 2;
            } else {
                low = mid;
                mid = low + (high - low) / 2;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {2, 3, 5, 7, 9};
        int target = 3;
        int size = arr.length;

        int low = 0;
        int high = size - 1;
        int mid = low + (high - low) / 2;
        int result = search(arr, target, low, mid, high, size);

        if(result != -1){
            System.out.println("Number found at index of: " + result);
        } else{
            System.out.println("Number Not found");
        }
    }

}
