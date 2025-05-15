public class Octal extends NumberConvertor {

    public Octal (int octNum){
        super(octNum);
    }

    public int getOctalToDecimal (){
        return super.convertToDecimal(super.octBase);
    }

    public String getOctalToBinary (){
        return super.decimalConvertor(super.binBase, getOctalToDecimal());
    }

    public String getOctalToHex (){
        return super.decimalConvertor(super.hexBase, getOctalToDecimal());
    }
}
