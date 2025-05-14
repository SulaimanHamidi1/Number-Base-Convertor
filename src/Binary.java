public class Binary extends NumberConvertor {

    public Binary (int binNum){
        super(binNum);
    }

    public int getBinaryToDecimal (){
        return super.convertToDecimal(super.binBase);
    }

    public String getBinaryToOctal (){
        return "0o" + super.binaryConvertor(super.octBase);
    }

    public String getBinaryToHex (){
        return "0x" + super.binaryConvertor(super.hexBase);
    }
}
