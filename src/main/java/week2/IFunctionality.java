package week2;

public interface IFunctionality {
    // calculate BMI based on the person's cpr-no
    double getBMI(String cpr);
    // return a text that describes the BMI range
    String getTextualBMI(String cpr);
    // return the person name based on the cpr-no
    String getName(String cpr);
}
