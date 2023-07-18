package July2023;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) throws FileNotFoundException {
        // Scanner scanner = new Scanner(new File("src/input"));
        Scanner scanner = new Scanner(System.in);

        char x;
        int cpt=1;
        String name = scanner.nextLine();
        for(int i = 0; i<name.length(); i++){
            x = name.charAt(i);
            for(int j=i+1; j<name.length(); j++){
                if(name.charAt(j)==x) break;
                if(name.charAt(j)!=x && j==name.length()-1) cpt++;

            }
        }

        if(cpt%2 == 1) System.out.println("IGNORE HIM!");
        else System.out.println("CHAT WITH HER!");

    }
}
