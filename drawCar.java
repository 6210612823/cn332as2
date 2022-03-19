import java.awt.Color;
import java.util.Scanner;
import javax.swing.JFrame;

public class drawCar {
    public static void drawCar() {
        JFrame fr = new JFrame();
        fr.setBounds(10, 10, 500, 500);
        fr.setDefaultCloseOperation(3);

        Scanner myObj = new Scanner(System.in); // Create a Scanner object

        //home size
        System.out.println("Where is your starting coordinate ?");
        int start = myObj.nextInt();
        myObj.nextLine();

        System.out.println("How much is your car size ?");
        int size = myObj.nextInt();
        myObj.nextLine();
        int [] locations = {start,(size*2)};

        //draw tire
        int [] circleLocations1 = {((start/2)+(size/4)), (2*size + ((2/4)*size)) };
        String colorString = "black";
        Color color = colorConvert.stringToColor(colorString);
        fr.add(drawShapes.circle((size/4), color, circleLocations1));
        fr.setVisible(true);

        int[] circleLocations2 = {((start/2)+(size/2)+(size/4)), (2*size + ((2/4)*size))};
        fr.add(drawShapes.circle((size/4), color, circleLocations2));
        fr.setVisible(true);

        //draw body
        System.out.println("What is the color of your car body ?");
        colorString = myObj.nextLine();
        color = colorConvert.stringToColor(colorString);
        fr.add(drawShapes.rect(size, (size/2), color, locations));
        fr.setVisible(true);

        //draw top
        System.out.println("What is the color of your car top ?");
        colorString = myObj.nextLine();
        myObj.nextLine();
        color = colorConvert.stringToColor(colorString);
        int [] squarelocation = {((start)+(size/2)), (2*size + ((2/4)*size)) };
        fr.add(drawShapes.square((size/2), color, squarelocation));
    }
}
