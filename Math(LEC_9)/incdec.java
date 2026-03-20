public class incdec {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3

        };
        int inc = 1;
        int dec = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1])
                dec = 0;
            if (arr[i] < arr[i - 1])
                inc = 0;
        }
        System.out.println(inc == 1 || dec == 1);
    }
}