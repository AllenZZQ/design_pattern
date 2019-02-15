package observer.pull;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        ConditionDisplay conditionDisplay = new ConditionDisplay(weatherData);

        weatherData.setTemperature(10.1);
        weatherData.setTemperature(10.2);
    }
}
