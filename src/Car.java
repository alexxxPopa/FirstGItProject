import java.util.Objects;

public class Car {
//    private
    private String color;
    private static int noOfwheels;

    static int sum(int...elements) {
        System.out.println(elements[0]);
        int sum = 0;
        for(int element: elements) {
            sum += element;
        }
        return sum;
    }
}