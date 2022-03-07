package mvvm;

import javafx.application.Application;
import javafx.stage.Stage;
import mvvm.mediator.TemperatureModel;
import mvvm.mediator.TemperatureModelManager;
import mvvm.model.Heater;
import mvvm.model.Thermometer;

public class HelloApplication extends Application
{

  @Override public void start(Stage stage) throws Exception
  {

  }

  public static void main(String[] args)
  {
    Heater heater = new Heater();

    TemperatureModel model = new TemperatureModelManager(heater);


  }
}
