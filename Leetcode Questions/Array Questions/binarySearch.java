import java.util.Scanner;

public class binarySearch {

    public static int binarySearch(int arr[], int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            // int mid = (right+left) / 2;
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        

        for(int i = 0; i<10; i++){
            System.out.println("Enter Target Element :");
            int target = sc.nextInt();
            System.out.println( "The target element is located at index : " + binarySearch(arr, target));
            System.out.println("If You Want To Search Another Press 1. If You Don't Press 0");
            int ur = sc.nextInt();
            if(ur != 1){
                break;
            }
        }
        
    }
}
