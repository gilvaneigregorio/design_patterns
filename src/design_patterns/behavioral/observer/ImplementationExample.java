package design_patterns.behavioral.observer;

import design_patterns.behavioral.observer.behaviors.CurrentConditionsDisplay;
import design_patterns.behavioral.observer.behaviors.ForecastDisplay;
import design_patterns.behavioral.observer.behaviors.HeatIndexDisplay;
import design_patterns.behavioral.observer.behaviors.StatisticsDisplay;
import design_patterns.behavioral.observer.object.WeatherData;

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
