package June2023;

import java.util.Scanner;

public class BinaryCafe { // the link of the problem in codeforces: https://codeforces.com/contest/1840/problem/B

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int n,k;
        String out="";

        for (int i=0; i<t; i++){
            n = scanner.nextInt();
            k = scanner.nextInt();
            out+=(int)Math.min(n+1, Math.pow(2, k))+"\n";
        }
        System.out.println(out);

    }
}
