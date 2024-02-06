package nl.hva.observablestation;

import nl.hva.sensors.*;
import java.util.ArrayList;
import java.util.List;

public class ObservableWeatherStation implements Subject{ //TODO implement interfaces as necessary

    //TODO add a structure to hold the sensors, observers and the current weather
    private List<Observer> observers;
    private List<Sensor> sensors;
    private String weatherData;

    public ObservableWeatherStation() {

        observers = new ArrayList<>();
        sensors = new ArrayList<>();
        sensors.add(new RainGauge());
        sensors.add(new Thermometer());
        sensors.add(new Hygrometer());
        sensors.add(new Anemometer());
    }

    public void checkSensors(){
        StringBuilder sb = new StringBuilder("Current weather is: \n");
        for (Sensor sensor : sensors) {
            sensor.takeMeasurement();
            sb.append(sensor.toString()).append("\n");
        }
        weatherData = sb.toString();
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o: observers){
            o.update(weatherData);
        }
    }

    public int getNumberOfObservers(){
        return observers.size();
    }

}