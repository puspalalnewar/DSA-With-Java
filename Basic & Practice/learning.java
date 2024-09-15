import java.util.Scanner;

public class learning {

    // Get the square of num
    public static int square(int num){
        return num * num;
    }

    public static void main(String[] args) {
        System.out.print("Enter Num : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = square(num);
        System.out.println("Square of " + num + " = " + ans);
    }
}