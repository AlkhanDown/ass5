import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("IT Project menu: ");

        boolean switching = false;
        int choice = 0;

        while (choice >= 1 && choice <= 4 || !switching) {
            try {

                System.out.println("1 insert into statement");
                System.out.println("2 select statement");
                System.out.println("3 delete statement");
                System.out.println("4 quit of program");

                System.out.println();

                choice = in.nextInt();

                switch (choice) {
                    case 1:
                        Database.insert();
                        break;
                    case 2:
                        Database.select();
                        break;
                    case 3:
                        Database.delete();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Error !, make correct decision (1-4)");
                }

                switching = true;

            } catch (InputMismatchException e) {
                System.out.println("Please input an integer");
                System.out.println("Required int, instead of: " + in.nextLine());
            }
        }
    }
}