public class singleNumberII {

    // Time Complexity O(N^2)
    public static int singleNumber(int[] nums) {
        int count = 0;
        int store = 0;
        for(int i = 0; i<nums.length; i++){
            for(int j = 0; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                    store = nums[i];
                }
            }
            if(count == 1){
                return store;
            }else{
                count = 0;
                store = 0;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 2, 0};
        System.out.println(singleNumber(arr));
    }
}
