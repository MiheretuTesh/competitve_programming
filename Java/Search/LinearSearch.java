package Java.Search;

class LinearSearch {
    static int search(int[] arr, int size, int number) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {2, 3, 4, 5, 6, 9, 11};
        int number = 11;

        int result = search(arr, arr.length, number);

        if(result == -1){
            System.out.println(number + " Number is not found");
        } else{
            System.out.println("Number is found at index: " + result);
        }
    }
}