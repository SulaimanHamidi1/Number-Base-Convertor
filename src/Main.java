public class Main {

    public static void main (String [] args){

//        Decimal decimal = new Decimal(761);
//        System.out.println(decimal.getDecimalToBinary());
//        System.out.println(decimal.getDecimalToOctal());
//        System.out.println(decimal.getDecimalToHex());
//
//        Binary binary = new Binary(11001011);
//        System.out.println(binary.getBinaryToDecimal());
//        System.out.println(binary.getBinaryToOctal());
//        System.out.println(binary.getBinaryToHex());
//
//        Octal octal = new Octal(34);
//        System.out.println(octal.getOctalToDecimal());
//        System.out.println(octal.getOctalToBinary());
//        System.out.println(octal.getOctalToHex());

        HexaDecimal hex = new HexaDecimal("-A");
        System.out.println(hex.getHexToDecimal());
        System.out.println(hex.getHexToOctal());
        System.out.println(hex.getHexToBinary());
    }
}
