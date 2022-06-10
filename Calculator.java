import java.util.Scanner;

class Program {

    public static void main(String[] args) {
        double num1, num2, result, menu_choice;
        int show_menu = 1;

        while (show_menu == 1) {
            System.out.println(
                    "MAIN_MENU\n_____________\n\n1. Addition\n2. Subtraction\n3. Division\n4. Multiplication\n5. Exit");

            Scanner input = new Scanner(System.in);

            menu_choice = input.nextDouble();
            if (menu_choice == 1) {
                System.out.println("Enter in first number:");
                num1 = input.nextDouble();

                System.out.println("Enter in second number:");
                num2 = input.nextDouble();

                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);

                System.out.println("\n\n Enter any number to continue to menu!!");
                input.nextDouble();
                
            } else if (menu_choice == 2) {
                System.out.println("Enter in first number:");
                num1 = input.nextDouble();

                System.out.println("Enter in second number:");
                num2 = input.nextDouble();

                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);

                System.out.println("\n\nEnter any number to continue to menu!!");
                input.nextDouble();

            } else if (menu_choice == 3) {
                System.out.println("Enter in first number:");
                num1 = input.nextDouble();

                System.out.println("Enter in second number:");
                num2 = input.nextDouble();

                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);

                System.out.println("\n\nEnter any number to continue to menu!!");
                input.nextDouble();

            } else if (menu_choice == 4) {
                System.out.println("Enter in first number:");
                num1 = input.nextDouble();

                System.out.println("Enter in second number:");
                num2 = input.nextDouble();

                result = num1 - num2;
                System.out.println(num1 + " * " + num2 + " = " + result);

                System.out.println("\n\nEnter any number to continue to menu!!");
                input.nextDouble();

            } else if (menu_choice == 5) {
                System.out.println("Bye Bye!");
                show_menu = 0;
            }
        }
    }
}