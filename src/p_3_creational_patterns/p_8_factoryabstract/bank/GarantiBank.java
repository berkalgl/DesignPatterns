package p_5_creational_patterns.p_8_factoryabstract.bank;

public class GarantiBank implements IBaseBank{
    @Override
    public String getType() {
        return "Garanti";
    }
}
