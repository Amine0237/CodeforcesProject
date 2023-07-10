package June2023;

import java.util.Scanner;

public class SashaAndArrayColoring { // the link of the problem in codeforces: https://codeforces.com/contest/1843/problem/A

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String finalOut="";

        int t = scanner.nextInt();
        int n, k, key;

        for (int i=0; i<t; i++){
            n = scanner.nextInt();
            int[] a = new int[n];
            for(int j = 0; j<n; j++){

                key = scanner.nextInt();
                k=j-1;

                while (k >= 0 && a[k] > key) {
                    a[k + 1] = a[k];
                    k = k - 1;
                }
                a[k + 1] = key;
            }

            int o=0,p=n-1, out=0;
            while(o<p){
                out += a[p]-a[o];
                o++; p--;
            }

            finalOut+=out+"\n";
        }
        System.out.println(finalOut);
    }
}
