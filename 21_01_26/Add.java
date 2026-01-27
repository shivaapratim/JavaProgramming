import java.util.*;

class Add {

    public int addNumber(int a, int b) {
        return a + b;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        Add obj = new Add();

        System.out.println(obj.addNumber(a, b));

        sc.close();
    }
}