import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int floors =Integer.parseInt(scanner.nextLine());
        switch (floors){
            case 9 :
                System.out.println("Здрасти Мими");
                break;
            case 8 :
                System.out.println("Здрасти Пепи");
                break;
            case 7 :
                System.out.println("Здрасти Ваня");
                break;
            case 6 :
                System.out.println("Здрасти Деси");
                break;
            case 5 :
                System.out.println("Здрасти Ели");
                break;
            case 4 :
                System.out.println("Здрасти Поли");
                break;
            case 3 :
                System.out.println("Здрасти Галя");
                break;
            case 2 :
                System.out.println("Здрасти Диди");
                break;
            case 1 :
                System.out.println("Здрасти Вики");
                break;
            default:
                System.out.println("Ауч");
                break;
        }
    }
}
