public class findSmallest {

    public static int findSmallest(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = arr[j];
                if (arr[i] > arr[j]) {
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr[0];
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 7, 0, 6, -1, 23 };
        System.out.println("The smallest element : " + findSmallest(arr));
        
    }
}
