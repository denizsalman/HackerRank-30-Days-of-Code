import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();

        String result = "";

        for(int i = 0; i < n; i++) {
            String s = input.nextLine();
            String resultEven = "";
            String resultOdd = "";
            for(int j = 0; j < s.length(); j++) {
                if(j % 2 == 0) {
                    resultEven += s.charAt(j);
                } else {
                    resultOdd += s.charAt(j);
                }
            }
            result += resultEven + " " + resultOdd + "\n";
        }
        System.out.println(result);

        //test1
        //test2
        //test3
        //test4
    }
}
