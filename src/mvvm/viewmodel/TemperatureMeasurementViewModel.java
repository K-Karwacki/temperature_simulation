package mvvm.viewmodel;

import mvvm.mediator.TemperatureModel;

public class TemperatureMeasurementViewModel
{
  private final TemperatureModel temperatureModel;

  public TemperatureMeasurementViewModel(TemperatureModel temperatureModel){
    this.temperatureModel = temperatureModel;
  }
}
