package LinearSearch;
public class SearchInArray {
    public static void main(String[] args) {
    int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
     int target = 19;
     int ans = linearSearch(nums, target);
     System.out.println(ans);
    }
    //Search in the array: return the index if item found
    //Otherwise if item not found return -1
    static int linearSearch(int[] arr, int tarrget){
        if(arr.length == 0){
            return -1;

        }
        //run a for loop
        for(int index = 0; index < arr.length; index++){
            //check for element at every index;
            int element = arr[index];
            if(element == tarrget){
                return index;
            }
        }

        // this line is execute if none of the return statement above is executed
        //hence the target not found.
        return -1;
    }
}
