public class reverseWords {

    public static String reverseWords(String s){
        String[] words = s.trim().split("\\s+"); // Removing extra spaces and Converting to array
        int left = 0;
        int right = words.length - 1;
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
        return String.join(" ", words); // Converting to String
    }

    public static void main(String [] args){
        // Input: s = "the sky is blue"
        // Output: "blue is sky the"

        String str = "the sky is blue";
        System.out.println( "Reversed Words : " + reverseWords(str));
    }   
}
