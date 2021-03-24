import java.util.Scanner;

public class AreaofFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();


        if (figure.equals("square")) {
            double sideSquare = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", sideSquare * sideSquare);
        }

        if (figure.equals("rectangle")) {
            double side1 = Double.parseDouble(scanner.nextLine());
            double side2 = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", side1 * side2);
        }

        if (figure.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", Math.PI * radius * radius);
        }


        if (figure.equals("triangle")) {
            double side1Triangle = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", (side1Triangle * height) / 2);
        }


    }
}
