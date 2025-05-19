public class MasterClass {

    public void getInput () {
        UserInterface userInterface = new UserInterface();

        while (true) {
            int input = userInterface.printMenu();

            while (true) {
                int secondInput = userInterface.printSubMenu(input);

                if (input == 5 || secondInput == 5) {
                    return;
                } else if (secondInput == 4) {
                    break;
                }
                String number = userInterface.getNumber();
                userInterface.convertNumber(input, secondInput, number);
            }
        }
    }
}
