public class Decimal extends NumberConvertor {

    final int decNum;
    final int binBase = 2;
    final int octBase = 8;
    final int hexBase = 16;

    public Decimal (int decNum){
        super(decNum);
        this.decNum = decNum;
    }

    public String getDecimalToBinary (){
        return super.decimalConvertor(binBase, decNum);
    }
    public String getDecimalToOctal (){
        return super.decimalConvertor(octBase, decNum);
    }
    public String getDecimalToHex (){
        return super.decimalConvertor(hexBase, decNum);
    }
}
