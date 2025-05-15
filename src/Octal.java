public class Octal extends NumberConvertor {

    public Octal (int octNum){
        super(octNum);
    }

    public int getOctalToDecimal (){
        return super.convertToDecimal(super.octBase);
    }

    final int decNum = getOctalToDecimal();

    public String getOctalToBinary (){
        if (decNum < 0){
            return "-0b" + super.decimalConvertor(super.binBase, decNum);
        }
        return "0b" + super.decimalConvertor(super.binBase, decNum);
    }

    public String getOctalToHex (){
        if (decNum < 0){
            return "-0x" + super.decimalConvertor(super.hexBase, decNum);
        }
        return "0x" + super.decimalConvertor(super.hexBase, getOctalToDecimal());
    }
}
