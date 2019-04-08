package designPattern.observer.push;



import java.util.Observable;
import java.util.Observer;

public class ConditionDisplay implements Observer {





    @Override
    public void update(Observable o, Object arg) {
        WeatherData weatherData = (WeatherData) o;
        System.out.println(arg);
        System.out.println(weatherData.getTemperature());
    }
}
