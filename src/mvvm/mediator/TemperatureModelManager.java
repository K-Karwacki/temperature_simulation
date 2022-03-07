package mvvm.mediator;

import mvvm.model.Heater;
import mvvm.model.Thermometer;
import mvvm.model.ThermometerModel;

import java.util.ArrayList;

public class TemperatureModelManager implements TemperatureModel,
    ThermometerModel
{
  private Heater heater;
  private ArrayList<Thermometer> thermometersArrayList = new ArrayList<>();

  public TemperatureModelManager(Heater heater){
    this.heater = heater;
  }

  @Override public void getHeaterState()
  {

  }

  @Override public void measureThermometerById(int id)
  {

  }

  @Override public void measureAllThermometers()
  {

  }

  @Override public void addThermometer(Thermometer thermometer)
  {
    thermometersArrayList.add(thermometer);
  }

  //  void getHeaterState(){};
//  void get(String name);

}
