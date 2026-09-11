package LinearSearch;

public class SearchInStrings {
    public static void main(String[] args) {
    String name = "Shubham Jha";
    char target = 'l';
    System.out.println(search(name, target));
    }
    public static boolean search(String str , char target){
        if  (str.length() == 0){
            return false;
        }
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
}
