public class HexaDecimal extends NumberConvertor{

    public HexaDecimal (String hexNum){
        super(hexNum);
    }

    public int getHexToDecimal (){
        return super.convertHexToDecimal();
    }

    public String getHexToBinary (){
        return super.decimalConvertor(super.binBase, getHexToDecimal());
    }

    public String getHexToOctal (){
        return super.decimalConvertor(super.octBase, getHexToDecimal());
    }
}
