//import java.math.BigDecimal;



import org.w3c.dom.css.Rect;

import java.awt.*;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
//    static int a = 3;
    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle(10, 19);
//        Rectangle rectangle2 = new Rectangle(8, 17);
//        Rectangle rectangle3= new Rectangle(6, 11);
//        Rectangle rectangle4 = new Rectangle(10, 1);
//        Rectangle rectangle5 = new Rectangle(10, 32);

//        Rectangle[] rectangles = {rectangle, rectangle2, rectangle3, rectangle4, rectangle5};
//        for(Rectangle r: rectangles) {
//            System.out.println(r.calculateAria());
//        }
//
//        Rectangle.sumArias(rectangle, rectangle2, rectangle3);
//        Rectangle.sumArias(rectangles);
//
//
//        System.out.println(rectangle.calculateAria());

//        for(int i = 0; i < args.length; i++) {
//            int length = (int)(Math.random() * 100 +1);
//            int height = (int) (Math.random() * 100 +1);
//            Rectangle r = new Rectangle(length, height);
//            System.out.println(r.calculateAria());
//        }
        Scanner in = new Scanner(System.in);
        System.out.println("Enter height");
        while(!in.hasNextInt()) {
            System.out.println("please enter an integer");
            in.nextLine();
        }
        int height = in.nextInt();
        System.out.println("Enter length");
        while(!in.hasNextInt()) {
            System.out.println("please enter an integer");
            in.next();
        }
        int length = in.nextInt();
        Rectangle r = new Rectangle(height, length);
        System.out.println(r.calculateAria());

//        for (String name: args) {
//            System.out.println(name);
//
//        Car.color = "new color";
//        Car.changeColor();
//        c.color = "red";
//        c.changeColor("red");
//        System.out.println(d.noOfwheels);

//        System.out.println(a.equals(b));

//        System.out.printf("%15s", "Hello World!");
//        float num = 12.321312f;
////        System.out.printf("%.4f", num);
//        System.out.println(round(num, 4));
//        float first;
//        byte second;
//        char third;
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter float");
//        while (!in.hasNextFloat()) {
//            in.nextLine();
//            System.out.println("again, not a float");
//        }
//        first = in.nextFloat();
//        System.out.println("Enter char");
//        third = in.next().charAt(0);
//        System.out.println("first " + first);
//        System.out.println("third " + third);

//        Row:
//        for (int i=1; i<10; i += 2) {
//            Column:
//            for (int j=0; j<i; j++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//        Row:
//        for (int i=1; i<=8; i++) {
//            Column:
//            for (int j=1; j<=8; j++) {
//                if(i == 1 || i == 8 || j == 1 || j == 8) {
//                    System.out.print("*");
//                } else if (i == j || i == (8 -j) + 1) {
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println("");
//        }


    }

//    public static double round (float number, int decimalPlace){
//        BigDecimal bd = new BigDecimal(number);
//        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
//        return bd.floatValue();
//        DecimalFormat f = new DecimalFormat("##.00");
//        return  Math.round(number* 1000.0)/1000.0;
//        System.out.println(f.format(number));
}
