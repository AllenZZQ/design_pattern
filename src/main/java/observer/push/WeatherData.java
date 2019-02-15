package observer.push;

import java.util.Observable;

public class WeatherData extends Observable {


    private double temperature;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        setChanged();
        notifyObservers(temperature);
    }
}
