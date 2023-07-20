package July2023;

import java.io.FileNotFoundException;
import java.util.Scanner;


public class DreamonAndWifi {

    public static double factt(int x) {
        int p = 1;
        for (int i=1; i<=x; i++) p*=i;
        return p;
    }
    public static void main(String[] args) throws FileNotFoundException {
        // Scanner scanner = new Scanner(new File("src/input"));
        Scanner scanner = new Scanner(System.in);

        String sender_message = scanner.nextLine();
        String receiver_message = scanner.nextLine();
        int sender_score=0, receiver_score=0;
        double unknown= 0F, difference=0F, out=0F;

        for(int i = 0; i<sender_message.length(); i++) {
            if(sender_message.charAt(i) == '+') sender_score++;
            else sender_score--;
        }

        for(int i = 0; i<receiver_message.length(); i++) {
            if(receiver_message.charAt(i) == '+') receiver_score++;
            else if(receiver_message.charAt(i) == '-') receiver_score--;
            else unknown++;
        }

        difference = receiver_score-sender_score;

        int x, y;

        if(difference!=0){
            if(Math.abs(difference)>unknown || (unknown-Math.abs(difference))%2==1) out=0;
            else {
                x = (int) ((Math.abs(difference)+unknown)/2); // number of + signs
                y = (int) ((unknown-Math.abs(difference))/2); // number of - signs
                out = (factt((int)unknown)/(factt(x)*factt(y)))/(Math.pow(2,unknown));
            }
        } else {
            if(unknown%2 == 1) out=0;
            else {
                x = ((int)unknown)/2;
                out = (factt((int)unknown)/(factt(x)*factt(x)))/(Math.pow(2,unknown));
            }
        }

        System.out.printf("%.10f", out);

    }
}
