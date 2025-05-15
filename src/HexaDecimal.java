public class HexaDecimal extends NumberConvertor{

    public HexaDecimal (String hexNum){
        super(hexNum);
    }

    public int getHexToDecimal (){
        return super.convertHexToDecimal();
    }

    final int decNum = getHexToDecimal();

    public String getHexToBinary (){
        if (decNum < 0){
            return "-0b" + super.decimalConvertor(super.binBase, decNum);
        }
        return "0b" + super.decimalConvertor(super.binBase, decNum);
    }

    public String getHexToOctal (){
        if (decNum < 0){
            return "-0b" + super.decimalConvertor(super.octBase, decNum);
        }
        return "0o" + super.decimalConvertor(super.octBase, getHexToDecimal());
    }
}
