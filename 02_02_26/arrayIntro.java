import java.util.*;

public class arrayIntro {

    public static void swapp(int arr[]) {
        arr[2] += arr[3];
        arr[3] = arr[2] - arr[3];
        arr[2] = arr[2] - arr[3];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        swapp(arr);

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
