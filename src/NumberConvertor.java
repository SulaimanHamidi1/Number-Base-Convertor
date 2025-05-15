public class NumberConvertor {

    final int originalNumber;
    final String hexNumber;

    final int decBase = 10;
    final int binBase = 2;
    final int octBase = 8;
    final int hexBase = 16;

    public NumberConvertor(int originalNumber) {
        this.originalNumber = originalNumber;
        this.hexNumber = null;
    }
    public NumberConvertor(String hexNumber) {
        this.hexNumber = hexNumber;
        this.originalNumber = 0;
    }

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
        return convertedNumber;
    }

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

    public String binaryConvertor (int base) {
        if (base == octBase){
            return decimalConvertor(octBase, convertToDecimal(binBase));
        }
        return decimalConvertor(hexBase, convertToDecimal(binBase));
    }

    public int convertHexToDecimal (){
        int result = 0;
        for (int i = 0; i < hexNumber.length(); i++){
            char digit = hexNumber.charAt(i);
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
            }
            result = result * hexBase + value;
        }
        if (hexNumber.charAt(0) == '-'){
            result = result * -1;
        }
        return result;
    }
}
