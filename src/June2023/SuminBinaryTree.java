package June2023;

import java.util.Scanner;

public class SuminBinaryTree { // the link of the problem in codeforces: https://codeforces.com/contest/1843/problem/C
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String finalOut="";

        int t = scanner.nextInt();
        Long n, out;

        for(int i = 0; i<t; i++){
            n = scanner.nextLong();
            out=1l;

            while(n!=1){
                out+=n;
                n=n/2;
            }
            finalOut+=out+"\n";
        }

        System.out.println(finalOut);


    }
}
