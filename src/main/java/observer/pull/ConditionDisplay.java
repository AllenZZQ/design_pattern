package observer.pull;

import java.util.Observable;
import java.util.Observer;

public class ConditionDisplay implements Observer {


    private Observable observable;

    public ConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        WeatherData weatherData = (WeatherData) o;
        System.out.println(arg);
        System.out.println(weatherData.getTemperature());
    }
}
