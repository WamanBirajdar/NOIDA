package CoreJAVA_Lab;

import java.util.Scanner;

public class Q1 {

    static boolean isAnagram(String a, String b) {
    // Complete the function
    boolean result=false;
    String newString = a.toLowerCase();
    String newString2 = b.toLowerCase();

    int lengthString = a.length();
    int lengthString2 = b.length();
    if(lengthString!= lengthString2) return false;
    else
    {
        char[] newCString = newString.toCharArray();
        char[] newCString2 = newString2.toCharArray();

        java.util.Arrays.sort(newCString);
        java.util.Arrays.sort(newCString2);

        if(java.util.Arrays.equals(newCString, newCString2))
            result=true;
    }
    return result;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("The first line contains a string . ");
        String a = scan.next();
        System.out.println("The second line contains a string . ");
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
/*
OUTPUT:
The first line contains a string . 
DAD
The second line contains a string . 
DAD
Anagrams
*/
