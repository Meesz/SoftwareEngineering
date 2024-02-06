package nl.hva.observablestation;

public class WeatherDisplay implements Observer{ //TODO implement interfaces as necessary
    private String name;
    public WeatherDisplay(String name) {
        this.name = name;
    }

    @Override
    public void update(String weatherData) {
        System.out.println("Weather Update for " + name + ": " + weatherData);
    }


    //TODO implement methods as necessary

}
