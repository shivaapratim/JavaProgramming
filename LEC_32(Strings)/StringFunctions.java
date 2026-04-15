public class StringFunctions {

    public static void main(String[] args) {

        String s = "Hello World";
        String t = "hello world";

        // length of string
        System.out.println(s.length()); // 11

        // get character at index
        System.out.println(s.charAt(1)); // e

        // substring (start, end-1)
        System.out.println(s.substring(0, 5)); // Hello

        // substring from index to end
        System.out.println(s.substring(6)); // World

        // equals (case sensitive)
        System.out.println(s.equals(t)); // false

        // equalsIgnoreCase
        System.out.println(s.equalsIgnoreCase(t)); // true

        // compareTo (lexicographical)
        System.out.println(s.compareTo(t));
        // >0 means s > t, <0 means s < t, 0 means equal

        // index of first occurrence
        System.out.println(s.indexOf('o')); // 4

        // index of substring
        System.out.println(s.indexOf("World")); // 6

        // last occurrence
        System.out.println(s.lastIndexOf('o')); // 7

        // check if contains substring
        System.out.println(s.contains("Hello")); // true

        // to lower case
        System.out.println(s.toLowerCase()); // hello world

        // to upper case
        System.out.println(s.toUpperCase()); // HELLO WORLD

        String x = "   hi bro   ";

        // remove leading and trailing spaces
        System.out.println(x.trim()); // "hi bro"

        // replace character
        System.out.println(s.replace('o', 'x')); // Hellx Wxrld

        // replace substring
        System.out.println(s.replace("World", "Java")); // Hello Java

        String str = "a,b,c";

        // split into array
        String[] arr = str.split(",");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); // a b c
        }

        // starts with
        System.out.println(s.startsWith("He")); // true

        // ends with
        System.out.println(s.endsWith("ld")); // true

        // is empty
        System.out.println("".isEmpty()); // true

        // int to string
        int num = 123;
        String numStr = String.valueOf(num);
        System.out.println(numStr);

        // string to char array
        char[] ch = s.toCharArray();
        System.out.println(ch[0]); // H

    }
}