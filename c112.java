// https://paiza.jp/challenges/share/ZvIEphGduJAeSsdhcKDPYXwjP1XaoplW4U57Jkv4Ts8?campaign=133&source=social

import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[][] x = new int[n][3];
        int min = 0;
        int max = 0;
        
        for(int i = 0; i < n; i++) {
            int time = 0;
            for(int j = 0; j < 3; j++) {
                x[i][j] = sc.nextInt();
                if (j < 2) {
                    time += x[i][j];
                } else {
                    time -= x[i][j];
                }
            }
            int result = 24 + time;
            if(min == 0 || min > result) {
                min = result;
            }
            if(max < result) {
                max = result;
            }
        }
        
        System.out.println(min);
        System.out.println(max);
        
        sc.close();
    }
}
