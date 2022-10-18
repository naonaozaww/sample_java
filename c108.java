// https://paiza.jp/challenges/share/6kEDTpKk4RNjVtsGHdaMX8PoTlwddj7Tphwbm-2mTa0?campaign=133&source=social

import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] visitTime = new int[n + 1];
        int[][] moveTime = new int[n + 1][n + 1];
        int result = 0;
        
        for(int i =1; i < n + 1; i++) {
            visitTime[i] = sc.nextInt();
        }
        
        for(int i =1; i < n + 1; i++) {
            for(int j = 1; j < n + 1; j++) {
                moveTime[i][j] = sc.nextInt();
            }
        }
        
        int m = sc.nextInt();
        int[] movePlan = new int[m];
        
        for(int i = 0; i < m; i++) {
            movePlan[i] = sc.nextInt();
        }
        
        for(int i = 0; i < m; i++) {
            result += visitTime[movePlan[i]];
            if(i < m - 1) {
                result += moveTime[movePlan[i]][movePlan[i + 1]];
            }
        }
        
        System.out.println(result);
        
    }
}
