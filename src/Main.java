import AbstractClass.Circle;
import AbstractClass.Figure;
import AbstractClass.Square;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Figure> l1 = new ArrayList<>();
        l1.add(new Circle("red",12));
        l1.add(new Square("blue",20));
        for (Figure fig : l1)
        {
            if(fig.getClass() == Circle.class)
            {
                System.out.println("Circle Perimeter:"+fig.perimetro());
            }
            if(fig.getClass() == Square.class){
                System.out.println("Square Perimeter:"+fig.perimetro());
            }
        }
    }
}