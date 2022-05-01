public class BMIService {

    public double calculate(double mass, double height) {

        double x = 2;                               // степень, в которую возводится рост человека
        double BMI = mass / Math.pow(height, x);    // расчет ИМТ

        System.out.printf("%.2f", BMI);

        return BMI;
    }


}

// double mass = 83.0;      масса тела человека в килограммах
// double height = 1.78;    рост человека в метрах
// "%.2f"                   количество знаков после запятой