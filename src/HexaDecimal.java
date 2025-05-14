public class HexaDecimal extends NumberConvertor{

    public HexaDecimal (String hexNum){
        super(hexNum);
    }

    public int getHexToDecimal (){
        return super.convertHexToDecimal();
    }

    public String getHexToBinary (){
        return "0b" + super.decimalConvertor(super.binBase, getHexToDecimal());
    }

    public String getHexToOctal (){
        return "0o" + super.decimalConvertor(super.octBase, getHexToDecimal());
    }
}
