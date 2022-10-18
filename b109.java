// https://paiza.jp/challenges/share/aD0Qy7UO39BQRJlSFTRxrxdMSOoTspE-cPKu6l3lLmo?campaign=133&source=social

import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int h = sc.nextInt();
        int w = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        
        int[][] space = new int[h][w];
        
        for(int i = 0; i < n; i++) {
            int reservedHeight = sc.nextInt();
            int reservedWidth = sc.nextInt();
            space[reservedHeight][reservedWidth] = -1;
        }
        
        if(space[p][q] != -1) {
            notReservedBestPlace(p, q, space);
        }
        
        int min = 0;
        for(int i = 0; i < h; i++) {
            for(int j = 0; j < w; j++) {
                
                if(space[i][j] == -1) {
                    continue;
                }
                
                int distanceHeight = setDistance(i, p);
                int distanceWidth = setDistance(j, q);
                int distance = distanceHeight + distanceWidth;
                space[i][j] = distance;

                if(min > distance || min == 0) {
                    min = distance;
                }
            }
        }
        
       for(int i = 0; i < h; i++) {
           for(int j = 0; j < w; j++) {
               if(space[i][j] == min) {
                   System.out.println(i + " " + j);
               }
           }
       }
        
    }
    
    public static int setDistance(int a, int b) {
        int result = a - b;
        if(result < 0) {
            result = -result;
        }
        return result;
    }
    
    public static void notReservedBestPlace(int p, int q, int[][] space) {
        System.out.println(p + " " + q);
        System.exit(0);
    }
}
