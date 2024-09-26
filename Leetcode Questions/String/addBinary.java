public class addBinary {

    public String addBinary(String a, String b) {
        return addBinarySolve(a, b);
    }
    public static String addBinarySolve(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;

        // Traverse both strings from right to left
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            
            // Add the bits from the first string
            if (i >= 0) {
                sum += a.charAt(i) - '0'; // Convert char to int
                i--;
            }
            
            // Add the bits from the second string
            if (j >= 0) {
                sum += b.charAt(j) - '0'; // Convert char to int
                j--;
            }
            
            // Compute the current bit and carry
            result.append(sum % 2);  // Append the remainder (0 or 1)
            carry = sum / 2;         // Compute the carry (either 0 or 1)
        }

        // Since we added bits from right to left, reverse the result
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String a ="1010";
        String b = "1011";
        System.out.println(addBinarySolve(a, b));
    }
}