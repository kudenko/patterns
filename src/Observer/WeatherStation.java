package Observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);


//        StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeassurements(80, 65, 30.2f);
        weatherData.setMeassurements(30, 35, 20.2f);
        weatherData.setMeassurements(810, 45, 50.2f);

    }
}
