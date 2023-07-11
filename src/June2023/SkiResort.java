package June2023;

import java.util.Scanner;

public class SkiResort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        int n, k, q;

        String finalOut = "";

        for(int i = 0; i<t; i++){
            String[] nkg = scanner.nextLine().split(" ");
            n = Integer.parseInt(nkg[0]);
            k = Integer.parseInt(nkg[1]);
            q = Integer.parseInt(nkg[2]);


            String[] a = scanner.nextLine().split(" ");
            int days=0;
            int out = 0;

            for(int j=0; j<n; j++){
                if(Integer.parseInt(a[j])<=q){
                    days++;
                    // if(days>=k) out+=days-k+1;
                } else {
                    if(days>=k){
                        out+=((days-k+1)*(days-k+2))/2;
                    }
                    days = 0;
                }
            }

            if(days>=k){
                out+=((days-k+1)*(days-k+2))/2;
            }

            finalOut+=out+"\n";

        }

        System.out.println(finalOut);


    }
}
