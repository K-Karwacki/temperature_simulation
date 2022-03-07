package mvvm.model;

public abstract class State
{
  Heater heater;

  public State(Heater heater){
    this.heater = heater;
  }

  public abstract String onLock();
  public abstract String onHeating();
  public abstract String onHigherPower();
  public abstract String onLowerPower();


}
