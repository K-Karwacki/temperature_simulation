package mvvm.model;

import java.util.Locale;

public class Heater
{
  private State state;
  private String heatingPower;
  private boolean isPowered;

  public Heater(){
    this.state = null;
    this.heatingPower = null;
    this.isPowered = false;
  }

  public void changeState(State state){
    this.state = state;
  }

  public void setPower(boolean heating){
    isPowered = heating;
  }

  public boolean isPowered()
  {
    return isPowered;
  }

  public void changeHeatingStateTo(String state)
  {

    String LOW_POWER = "LOW";
    String MEDIUM_POWER = "MEDIUM";
    String HIGH_POWER = "HIGH";

    switch (state.toUpperCase(Locale.ROOT)){
        case "LOW" -> this.heatingPower = LOW_POWER;
        case "MEDIUM" -> this.heatingPower = MEDIUM_POWER;
        case "HIGH" -> this.heatingPower = HIGH_POWER;

    }
  }

  public String getHeatingState()
  {
    return heatingPower;
  }
}
