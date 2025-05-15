public class Binary extends NumberConvertor {

    public Binary (int binNum){
        super(binNum);
    }

    public int getBinaryToDecimal (){
        return super.convertToDecimal(super.binBase);
    }

    public String getBinaryToOctal (){
        return super.binaryConvertor(super.octBase);
    }

    public String getBinaryToHex (){
        return super.binaryConvertor(super.hexBase);
    }
}
