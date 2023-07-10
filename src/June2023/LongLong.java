package June2023;

import java.util.Scanner;

public class LongLong { // The link of the problem in codeforces: https://codeforces.com/contest/1843/problem/B
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String finalOut="";

        int t = scanner.nextInt();
        Long n, previous, next, ways, sum;
        int k;

        for (int i=0; i<t; i++){
            ways = 0l;
            sum = 0l;
            k=1;

            n = scanner.nextLong();

            previous = scanner.nextLong();

            while(previous==0 && k<n){
                previous = scanner.nextLong();
                k++;
            }

            if(previous<0) ways+=1;

            sum+=Math.abs(previous);

            for(int j=k; j<n; j++){

                next = scanner.nextLong();
                if(next == 0) continue;
                sum +=Math.abs(next);

                if(previous>0 && next<0){
                    ways+=1;
                }
                previous = next;
            }

            finalOut+=sum+" "+ways+"\n";
        }
        System.out.println(finalOut);


    }
}
