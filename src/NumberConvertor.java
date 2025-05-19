public class NumberConvertor {

    final int originalNumber;
    final String originalHexNumber;

    final int decBase = 10;
    final int binBase = 2;
    final int octBase = 8;
    final int hexBase = 16;

    public NumberConvertor(int originalNumber) {
        this.originalNumber = originalNumber;
        this.originalHexNumber = null;
    }
    public NumberConvertor(String originalHexNumber) {
        this.originalHexNumber = originalHexNumber;
        this.originalNumber = 0;
    }

    //Convert a number of decimal base to any base
    public String decimalConvertor (int base, int number){
        String convertedNumber = "";
        int temp = number;

        if (number < 0){
            number *= -1;
        }
        while (number > 0){
            int lastDigit = number % base;
            if (lastDigit >= base){
                return "Invalid base number";
            }
            if (lastDigit > 9 && lastDigit < 16){
                String letter = switch (lastDigit){
                    case 10 -> "A";
                    case 11 -> "B";
                    case 12 -> "C";
                    case 13 -> "D";
                    case 14 -> "E";
                    case 15 -> "F";
                    default -> "";
                };
                convertedNumber = letter + convertedNumber;
            } else {
                convertedNumber = lastDigit + convertedNumber;
            }
            number /= base;
        }
        String prefix = (base == 8) ? "0o" : (base == 16 ? "0x" : "0b");
        convertedNumber = prefix + convertedNumber;

        if (temp < 0){
            convertedNumber = "-" + convertedNumber;
        }
        return convertedNumber;
    }

    //Converts the numbers of base 2 and 8 to a decimal base.
    public int convertToDecimal(int convertToBase){
        int base = 1;
        int number = originalNumber;
        int decNum = 0;

        if (number < 0){
            number *= -1;
        }
        for (int i = 0; number > 0; i++){
            int lastDigit = number % 10;
            decNum = (lastDigit * base) + decNum;
            base *= convertToBase;
            number /= 10;
        }
        if (originalNumber < 0){
            decNum *= -1;
        }
        return decNum;
    }

    //Converts a binary base to octal and hex base
    public String binaryConvertor (int base) {
        if (base == octBase){
            return decimalConvertor(octBase, convertToDecimal(binBase));
        }
        return decimalConvertor(hexBase, convertToDecimal(binBase));
    }

    //Converts a hex base to a decimal place
    public int convertHexToDecimal (){
        int result = 0;
        for (int i = 0; i < originalHexNumber.length(); i++){
            char digit = originalHexNumber.charAt(i);
            int value = 0;

            if (digit == '-'){
                continue;
            }
            if (digit >= 'A' && digit <= 'F'){
                value = decBase + (digit - 'A');
            }
            else if (digit >= '0' && digit <= '9'){
                value = digit - '0';
            }
            else if (digit >= 'a' && digit <= 'f'){
                value = decBase + (digit - 'a');
            }
            else {
                System.out.println("Invalid Number");
                return -1;
            }
            result = result * hexBase + value;
        }
        if (originalHexNumber.charAt(0) == '-'){
            result *= -1;
        }
        return result;
    }
}
