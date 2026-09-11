package LinearSearch;

public class FindMin {

    public static void main(String[] args) {

        int[] arr = {45, 12, 78, 23, 9, 56};

        int result = findMin(arr);

        System.out.println("Minimum value: " + result);
    }

    static int findMin(int[] arr) {

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
}