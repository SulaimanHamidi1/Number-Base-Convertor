import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);

    public int printMenu (){

        int input = -1;
        while (true){
            System.out.println("===================================");
            System.out.println("                MENU");
            System.out.println("===================================");
            System.out.println("1 -> Convert a Decimal Number");
            System.out.println("2 -> Convert a Binary Number");
            System.out.println("3 -> Convert an Octal Number");
            System.out.println("4 -> Convert a Hexadecimal Number");
            System.out.println("5 -> To Quit!");
            System.out.println("===================================");
            System.out.println("Enter your choice: ");


            String userInput = scanner.nextLine();

            try {
                input = Integer.parseInt(userInput);
                if (input >= 1 && input <= 5){
                    return input;
                } else {
                    System.out.println("--Invalid choice, try again!--\n");
                }
            } catch (NumberFormatException e){
                System.out.println("--Invalid input, please enter a number.--\n");
            }
        }
    }

    public int printSubMenu (int input){

        int secondInput = -1;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            switch (input) {
                case 1:
                    System.out.println("===========================");
                    System.out.println("1 -> Convert to Binary");
                    System.out.println("2 -> Convert to Octal");
                    System.out.println("3 -> Convert to Hexadecimal");
                    System.out.println("4 -> Go back");
                    System.out.println("5 -> Quit");
                    System.out.println("===========================");
                    System.out.println("Enter your choice: ");
                    break;

                case 2:
                    System.out.println("===========================");
                    System.out.println("1 -> Convert to Decimal");
                    System.out.println("2 -> Convert to Octal");
                    System.out.println("3 -> Convert to Hexadecimal");
                    System.out.println("4 -> Go back");
                    System.out.println("5 -> Quit");
                    System.out.println("===========================");
                    System.out.println("Enter your choice: ");
                    break;

                case 3:
                    System.out.println("===========================");
                    System.out.println("1 -> Convert to Binary");
                    System.out.println("2 -> Convert to Decimal");
                    System.out.println("3 -> Convert to Hexadecimal");
                    System.out.println("4 -> Go back");
                    System.out.println("5 -> Quit");
                    System.out.println("===========================");
                    System.out.println("Enter your choice: ");
                    break;

                case 4:
                    System.out.println("===========================");
                    System.out.println("1 -> Convert to Binary");
                    System.out.println("2 -> Convert to Octal");
                    System.out.println("3 -> Convert to Decimal");
                    System.out.println("4 -> Go back");
                    System.out.println("5 -> Quit");
                    System.out.println("===========================");
                    System.out.println("Enter your choice: ");
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    return secondInput;
            }

            String userInput = scanner.nextLine();

            try {
                secondInput = Integer.parseInt(userInput);
                if (secondInput >= 1 && secondInput <= 5) {
                    if (secondInput == 5){
                        System.out.println("Goodbye!");
                    }
                    return secondInput;
                } else {
                    System.out.println("--Invalid Choice, try again!--\n");
                }
            } catch (NumberFormatException e){
                System.out.println("--Invalid input, please enter a number--\n");
            }

        }
    }

    public String getNumber () {

        while (true) {
            System.out.print("Enter your Number: ");
            String number = scanner.nextLine();

            for (int i = 0; i < number.length(); i++) {
                if (number.charAt(i) > 'F' || number.charAt(i) > 'f') {
                    System.out.println("--Invalid number, try again!--\n");
                } else {
                    return number;
                }
            }
        }
    }


    public void convertNumber (int input, int secondInput, String number){

        System.out.println("Number: " + number);

        if (input == 1) {
            int wholeNumber = Integer.parseInt(number);
            Decimal decimal = new Decimal(wholeNumber);
            switch (secondInput) {
                case 1 -> System.out.println("Result: " + decimal.getDecimalToBinary());
                case 2 -> System.out.println("Result: " + decimal.getDecimalToOctal());
                case 3 -> System.out.println("Result: " + decimal.getDecimalToHex());
                default -> System.out.println("Invalid Choice, try again!");
            }
        }
        else if (input == 2){
            int wholeNumber = Integer.parseInt(number);
            Binary binary = new Binary(wholeNumber);
            switch (secondInput) {
                case 1 -> System.out.println("Result: " + binary.getBinaryToDecimal());
                case 2 -> System.out.println("Result: " + binary.getBinaryToOctal());
                case 3 -> System.out.println("Result: " + binary.getBinaryToHex());
                default -> System.out.println("Invalid input, try again!");
            }
        }
        else if (input == 3){
            int wholeNumber = Integer.parseInt(number);
            Octal octal = new Octal(wholeNumber);
            switch (secondInput) {
                case 1 -> System.out.println("Result: " + octal.getOctalToBinary());
                case 2 -> System.out.println("Result: " + octal.getOctalToDecimal());
                case 3 -> System.out.println("Result: " + octal.getOctalToHex());
                default -> System.out.println("Invalid input, try again!");
            }
        }
        else if (input == 4){
            HexaDecimal hex = new HexaDecimal(number);
            switch (secondInput) {
                case 1 -> System.out.println("Result: " + hex.getHexToBinary());
                case 2 -> System.out.println("Result: " + hex.getHexToOctal());
                case 3 -> System.out.println("Result: " + hex.getHexToDecimal());
                default -> System.out.println("Invalid input, try again");
            }
        }
    }
}
