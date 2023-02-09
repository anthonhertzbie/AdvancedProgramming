package week2;

public class Functionality implements IFunctionality{

    IData d;

    public Functionality(IData d){
        this.d = d;
    }

    @Override
    public double getBMI(String cpr) {
        double height = d.getHeight(cpr);
        double weight = d.getWeight(cpr);
        return weight/Math.pow(height, 2);
    }

    @Override
    public String getTextualBMI(String cpr) {
        return String.valueOf(getBMI(cpr));
    }

    @Override
    public String getName(String cpr) {
        return d.getName(cpr);
    }
}
