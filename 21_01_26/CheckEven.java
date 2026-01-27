import java.util.*;

public class CheckEven {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num % 2 == 0)
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");

        System.out.println(num % 2 == 0 ? "number is even" : "number is odd");

        sc.close();
    }

}

// a % b = a - (a/b) * b

// 25%2 = 25 - (25/2) * 2
// 25%2 = 25 - 24 = 1