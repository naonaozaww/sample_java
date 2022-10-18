// https://paiza.jp/challenges/share/bXLpHBy2gvVoyJxFbeiWjXWkxCIkeJsYay9Zlt3XCPU?campaign=133&source=social

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        String t = sc.next();
        char[] sToArray = s.toCharArray();
        char[] tToArray = t.toCharArray();
        Arrays.sort(sToArray);
        Arrays.sort(tToArray);
        
        if (s.equals(t)) {
            System.out.println("NO");
        } else if (Arrays.equals(sToArray, tToArray)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
