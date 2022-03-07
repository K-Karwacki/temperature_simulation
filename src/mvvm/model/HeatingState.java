package mvvm.model;

public class HeatingState extends State
{
  public HeatingState(Heater heater)
  {
    super(heater);
    if(!heater.isPowered()){
      heater.setPower(true);
      heater.changeHeatingStateTo("LOW");
    }
  }

  @Override public String onLock()
  {
    return null;
  }

  @Override public String onHeating()
  {
    return "is heating";
  }

  @Override public String onHigherPower()
  {
    switch (heater.getHeatingState()){
      case "LOW" -> heater.changeHeatingStateTo("MEDIUM");
      case "MEDIUM" -> heater.changeHeatingStateTo("HIGH");
    }
    return "Is heating and power " + heater.getHeatingState();
  }

  @Override public String onLowerPower()
  {
    switch (heater.getHeatingState()){
    case "MEDIUM" -> heater.changeHeatingStateTo("LOW");
    case "HIGH" -> heater.changeHeatingStateTo("MEDIUM");
  }
    return "Is heating and power " + heater.getHeatingState();
  }

}
