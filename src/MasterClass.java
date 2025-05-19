import java.util.Scanner;

public class MasterClass {

    public void getInput (){

        int input = 0;
        do {
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

            Scanner scanner = new Scanner(System.in);
            input = scanner.nextInt();


            int secondInput = 0, number = 0;

            switch (input) {
                case 1:
                    do {
                        System.out.println("===========================");
                        System.out.println("1 -> Convert to Binary");
                        System.out.println("2 -> Convert to Octal");
                        System.out.println("3 -> Convert to Hexadecimal");
                        System.out.println("4 -> Go back");
                        System.out.println("5 -> Quit");
                        System.out.println("===========================");
                        System.out.println("Enter your choice: ");
                        secondInput = scanner.nextInt();

                        if (secondInput == 4){
                            break;
                        } else if (secondInput == 5) {
                            return;
                        }

                        System.out.println("Enter your Decimal Number: ");
                        number = scanner.nextInt();

                        Decimal decimal = new Decimal(number);

                        switch (secondInput) {
                            case 1 -> System.out.println(decimal.getDecimalToBinary());
                            case 2 -> System.out.println(decimal.getDecimalToOctal());
                            case 3 -> System.out.println(decimal.getDecimalToHex());
                            default -> System.out.println("Invalid Choice, try again!");
                        } ;
                    } while (secondInput != 5);
                    break;

                case 2:
                    System.out.println("===========================");
                    System.out.println("1 -> Convert to Decimal");
                    System.out.println("2 -> Convert to Octal");
                    System.out.println("3 -> Convert to Hexadecimal");
                    System.out.println("===========================");
                    System.out.println("Enter your choice: ");
                    secondInput = scanner.nextInt();

                    System.out.println("Enter your Binary Number: ");
                    number = scanner.nextInt();

                    Binary binary = new Binary(number);

                    switch (secondInput) {
                        case 1 -> System.out.println(binary.getBinaryToDecimal());
                        case 2 -> System.out.println(binary.getBinaryToOctal());
                        case 3 -> System.out.println(binary.getBinaryToHex());
                        default -> System.out.println("Invalid input, try again!");
                    }
                    ;
                    break;


                case 3:
                    System.out.println("===========================");
                    System.out.println("1 -> Convert to Binary");
                    System.out.println("2 -> Convert to Decimal");
                    System.out.println("3 -> Convert to Hexadecimal");
                    System.out.println("===========================");
                    System.out.println("Enter your choice: ");
                    secondInput = scanner.nextInt();

                    System.out.println("Enter your Octal Number: ");
                    number = scanner.nextInt();

                    Octal octal = new Octal(number);

                    switch (secondInput) {
                        case 1 -> System.out.println(octal.getOctalToBinary());
                        case 2 -> System.out.println(octal.getOctalToDecimal());
                        case 3 -> System.out.println(octal.getOctalToHex());
                        default -> System.out.println("Invalid input, try again!");
                    }
                    ;
                    break;

                case 4:
                    System.out.println("===========================");
                    System.out.println("1 -> Convert to Binary");
                    System.out.println("2 -> Convert to Octal");
                    System.out.println("3 -> Convert to Decimal");
                    System.out.println("===========================");
                    System.out.println("Enter your choice: ");
                    secondInput = scanner.nextInt();

                    System.out.println("Enter your Hexadecimal Number: ");
                    String Number = scanner.next();

                    HexaDecimal hex = new HexaDecimal(Number);

                    switch (secondInput) {
                        case 1 -> System.out.println(hex.getHexToBinary());
                        case 2 -> System.out.println(hex.getHexToOctal());
                        case 3 -> System.out.println(hex.getHexToDecimal());
                        default -> System.out.println("Invalid input, try again");
                    };
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid Choice!\nPlease try again");
            }
        } while (input != 5);
    }
}
