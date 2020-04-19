import java.util.Scanner;

public class Ex1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            rectanglePerimeter();
            rectangleArea();
        }

        public static void rectanglePerimeter() {
            Scanner scanner = new Scanner(System.in);
            int a = Integer.parseInt(scanner.nextLine()) ;
            int b =Integer.parseInt(scanner.nextLine());

            System.out.println("Периметъра на правоъгълника е : "+ (2*a+2*b));

        }

        public static void rectangleArea() {
            Scanner scanner = new Scanner(System.in);
            int a = Integer.parseInt(scanner.nextLine()) ;
            int b =Integer.parseInt(scanner.nextLine());
            System.out.println("Лицето на правоъгълника е :  " +(a*b));

        }
    }


