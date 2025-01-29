import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of Rectangle:");
        int length= scanner.nextInt();
        System.out.print("Enter breadth of Rectangle:");
        float breadth= scanner.nextInt();

    float area=(length*breadth);
        System.out.print("Area of Rectangle:"+area);
    }
}
