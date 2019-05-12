package Observer;
import java.util.Observable;
import java.util.Observer;


public class ForecastDisplay implements Observer, DisplayElement {
    private  float lastPressure;

    public ForecastDisplay(Observable observable){
        observable.addObserver( this);
    }
    @Override
    public void display() {
        System.out.println("Pressure  = " + lastPressure);
    }

    @Override
    public void update(Observable observable, Object o) {
        if(observable instanceof WeatherData){
            lastPressure = ((WeatherData) observable).getPreassure();
            display();
        }
    }
}
