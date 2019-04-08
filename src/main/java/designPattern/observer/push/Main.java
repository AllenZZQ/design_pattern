package designPattern.observer.push;



public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.addObserver(new ConditionDisplay());

        weatherData.setTemperature(10.1);
        weatherData.setTemperature(10.2);
    }
}
