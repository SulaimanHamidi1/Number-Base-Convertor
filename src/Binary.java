public class Binary extends NumberConvertor {

    public Binary (int binNum){
        super(binNum);
    }

    public int getBinaryToDecimal (){
        return super.convertToDecimal(super.binBase);
    }

    final int decNum = getBinaryToDecimal();

    public String getBinaryToOctal (){
        if (decNum < 0){
            return "-0o" + super.binaryConvertor(super.octBase);
        }
        return "0o" + super.binaryConvertor(super.octBase);
    }

    public String getBinaryToHex (){
        if (decNum < 0){
            return "-0x" + super.binaryConvertor(super.hexBase);
        }
        return "0x" + super.binaryConvertor(super.hexBase);
    }
}
