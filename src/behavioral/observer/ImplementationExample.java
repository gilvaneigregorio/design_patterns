package behavioral.observer;

import behavioral.observer.behaviors.CurrentConditionsDisplay;
import behavioral.observer.behaviors.ForecastDisplay;
import behavioral.observer.behaviors.HeatIndexDisplay;
import behavioral.observer.behaviors.StatisticsDisplay;
import behavioral.observer.object.WeatherData;

public class ImplementationExample {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
		ForecastDisplay forecastDisplay = new ForecastDisplay();
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay();
		
		weatherData.registerObserver(currentDisplay);
		weatherData.registerObserver(statisticsDisplay);
		weatherData.registerObserver(forecastDisplay);
		weatherData.registerObserver(heatIndexDisplay);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
