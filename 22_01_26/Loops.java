// class Loops {

//     public static void main(String[] args) {
//         int sum = 12;

//         for (int i = 1; i < 4; i++) {
//             sum += i;
//         }

//         System.out.println(sum);
//     }

// }

// class Lops {

//     public static void main(String[] args) {
//         int sum = -8;

//         for (int i = 1; i < 3; i++) { 

//             for (int j = 3; j < 9; j *= 2) {
//                 sum += i;
//             }

//         }

//         System.out.println(sum);
//     }

// }

// class Lps {

// public static void main(String[] args) {
// int sum = -8;

// for (int i = 1; i <= 2; i++) {

// for (int j = 3; j < 9; j++) {
// sum += i;
// }

// }

// System.out.println(sum);
// }

// }

// class oops {

//     public static void main(String[] args) {
//         int sum = 15;

//         for (int i = 10; i >= -2; i--) {  

//             for (int j = 1; j < 2 ; j++) {  

//                 sum += i;

//             }

//         }

//         System.out.println(sum);
//     }

// }

// n = 5 

//         *  
//       *  
//     *  
//   * 
// *

public class Loops {

    public static void main(String[] args) {

        int n = 3;

        for (int i = 0; i <= 2 * n - 2; i++) {
            for (int j = 0; j <= 2 * n - 2; j++) {
                if ((i + j >= n - 1) && (i >= j - n + 1) && (i <= j + n - 1) && (i + j <= 3 * (n - 1))) {

                    System.out.print(" * ");

                } else {

                    System.out.print("   ");

                }
            }
            System.out.println("");
        }

    }
}