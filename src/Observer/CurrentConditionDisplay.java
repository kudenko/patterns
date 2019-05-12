package Observer;
import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    Observable observable;

    public CurrentConditionDisplay(Observable observable){
        this.observable = observable;
       observable.addObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Temperature is " + temperature + " Humidity is " + humidity);

    }

    @Override
    public void update(Observable observable, Object o) {
        if(observable instanceof WeatherData) {
            WeatherData wd = (WeatherData) observable;
            this.temperature = wd.getTemperature();
            this.humidity = wd.getHumidity();
            display();
        }
    }
}
