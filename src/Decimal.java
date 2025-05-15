public class Decimal extends NumberConvertor {

    final int decNum;

    public Decimal (int decNum){
        super(decNum);
        this.decNum = decNum;
    }

    public String getDecimalToBinary (){
        return super.decimalConvertor(super.binBase, decNum);
    }
    public String getDecimalToOctal (){
        return super.decimalConvertor(super.octBase, decNum);
    }
    public String getDecimalToHex (){
        return super.decimalConvertor(super.hexBase, decNum);
    }
}
