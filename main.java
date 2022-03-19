import java.awt.Color;
import java.util.Scanner;

import javax.swing.JFrame;

public class main {
    public static void main(String[] args) throws Exception {

        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("What do you want to draw ? (1 home) (2 car) (0 exit)");
        int Userinput = myObj.nextInt();

        while (Userinput != 0) {
            if(Userinput == 1) {
                drawHome.drawHome();
            }

            else if(Userinput == 2) {
                drawCar.drawCar();
            }
            
            System.out.println("What do you want to draw ? (1 home) (2 car) (0 exit)");
            Userinput = myObj.nextInt();
        }
    }
}