package June2023;

import java.util.Scanner;

public class GamewithBoard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        int n;
        String out = "";

        for (int i=0; i<t; i++){
            n = Integer.parseInt(scanner.nextLine());
            if(n>=5) out+="Alice\n";
            else out+="Bob\n";
        }
        System.out.println(out);

    }
}
