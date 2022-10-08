import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import test.RectangleShape;



public class RectangleShapeDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("Rectangle 1 Demo:");
        RectangleShape rect = new RectangleShape(30,30,"Black",true);
        rect.display();
        rect.Area();

        System.out.println("\nRectangle 2 Demo:");
        RectangleShape rect2 = new RectangleShape();
        rect2.setLength(30);
        rect2.setWidth(20);
        rect2.setColor("Red");
        rect2.setFilled(true);

        System.out.println("Rectangle Color: "+rect2.getColor());
        System.out.println("Rectangle Filled: "+rect2.getFilled());
        System.out.println("Rectangle Width: "+rect2.getWidth());
        System.out.println("Rectangle Height: "+rect2.getLength());
        rect2.Area();

        System.out.println("\nRectangle Demo (User input):");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String colInput;
        boolean filledInput;
        double widInput, lenInput;
        System.out.print("Input Color: ");
        colInput = input.readLine();
        System.out.print("Input Width: ");
        widInput = Double.parseDouble(input.readLine());
        System.out.print("Input Length: ");
        lenInput = Double.parseDouble(input.readLine());
        System.out.print("Filled (true/false): ");
        filledInput = Boolean.parseBoolean(input.readLine());

        RectangleShape rect3 = new RectangleShape();
        rect3.setColor(colInput);
        rect3.setWidth(widInput);
        rect3.setLength(lenInput);
        rect3.setFilled(filledInput);
        System.out.println("\n\nOUTPUT:");
        System.out.println("Color: "+rect3.getColor());
        System.out.println("Width: "+rect3.getWidth());
        System.out.println("Length: "+rect3.getLength());
        System.out.println("Filled: "+rect3.getFilled());
    }
}
