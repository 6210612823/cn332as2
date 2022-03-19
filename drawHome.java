import java.awt.Color;
import java.util.Scanner;
import javax.swing.JFrame;

public class drawHome {
    public static void drawHome() {
        JFrame fr = new JFrame();
        fr.setBounds(10, 10, 500, 500);
        fr.setDefaultCloseOperation(3);

        Scanner myObj = new Scanner(System.in); // Create a Scanner object

        //home size
        System.out.println("Where is your starting coordinate ?");
        int start = myObj.nextInt();
        myObj.nextLine();

        System.out.println("How much is your home size ?");
        int size = myObj.nextInt();
        myObj.nextLine();
        int [] locations = {start,(size*2)};
        int [] triangleCoordinates = {start,(size*2),((size/2)+start),((start + size)/2),(start+size),(size*2)};

        //draw roof
        System.out.println("What is the color of your roof ?");
        String colorString = myObj.nextLine();
        Color color = colorConvert.stringToColor(colorString);
        fr.add(drawShapes.triangle(triangleCoordinates, color, locations));
        fr.setVisible(true);
        
        //draw body
        System.out.println("What is the color of your house body ?");
        colorString = myObj.nextLine();
        color = colorConvert.stringToColor(colorString);
        fr.add(drawShapes.square(size, color, locations));
        fr.setVisible(true);
    }
}