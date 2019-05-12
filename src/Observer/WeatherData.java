package Observer;

import java.util.Observable;


public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float preassure;

    public WeatherData(){
    }

    public void meassurementChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeassurements(float t, float h, float p){
        temperature = t;
        humidity = h;
        preassure = p;
        meassurementChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPreassure() {
        return preassure;
    }
}
