package July2023;

import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = "";

        int lines = scanner.nextInt();
        int x = 0;

        while(scanner.hasNextLine()){
            line = scanner.nextLine();

            if(line.length() != 0){
                if(line.charAt(0) == '-' || line.charAt(2) == '-') x--;
                else x++;
            }
        }

        System.out.println(x);
    }
}
