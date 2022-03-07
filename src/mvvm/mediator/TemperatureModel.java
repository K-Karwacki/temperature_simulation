package mvvm.mediator;

import mvvm.model.Thermometer;

public interface TemperatureModel
{
  void getHeaterState();
  void measureThermometerById(int id);
  void measureAllThermometers();
  void addThermometer(Thermometer thermometer);



}
