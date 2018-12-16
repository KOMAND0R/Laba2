import java.util.Scanner;

public class CircleTest
{
    public static void main(String[] args)
    {
        Circle circle1 = new Circle(2, 2, 4, "BeautifulCircle");
        System.out.println("Характеристики первого круга: ");
        System.out.println("Центр круга: ("+circle1.getCentreX()+";"+circle1.getCentreY()+")");
        System.out.println("Радиус круга: "+circle1.getRadius());
        System.out.println("Название круга: "+circle1.getName());
        System.out.println("Площадь круга: "+circle1.getSquare());
        System.out.println("Площадь круга: "+circle1.getLength());
        System.out.println(" ");

        float x = 0;
        float y = 0;
        float r = 0;
        String name;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите точку X: ");
        if (sc.hasNextFloat())
        {
            x = sc.nextFloat();
        }
        System.out.print("Введите точку Y: ");
        if (sc.hasNextFloat())
        {
            y = sc.nextFloat();
        }
        System.out.print("Введите радиус: ");
        if (sc.hasNextFloat())
        {
            r = sc.nextFloat();
        }
        System.out.print("Введите название круга: ");
        name = sc.next();
        System.out.println(" ");

        Circle circle2 = new Circle(x, y, r, name);
        System.out.println("Характеристики второго круга: ");
        System.out.println("Центр круга: ("+circle2.getCentreX()+";"+circle2.getCentreY()+")");
        System.out.println("Радиус круга: "+circle2.getRadius());
        System.out.println("Название круга: "+circle2.getName());
        System.out.println("Площадь круга: "+circle2.getSquare());
        System.out.println("Площадь круга: "+circle2.getLength());
        System.out.println(" ");
    }
}
