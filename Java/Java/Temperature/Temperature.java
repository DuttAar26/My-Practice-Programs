package Temperature;

public class Temperature {
    int number = 0;
    public String ConvertTemp(int temperature, char convertTo) {
        double answer = 0;
        switch (convertTo) {
            case 'C':
                answer = (temperature - 32) / 1.8;
                System.out.println(answer +"Celcius");
                break;
            case 'F':
                answer = (temperature * 1.8) + 32;
                System.out.println(answer +"Fahrenheit");
                break;
        }
        return String(answer);
    }

    private String String(double answer) {
        return null;
    }
}