package mvvm.model;

public class Thermometer extends Thread
{
  private final int distance;
  private final boolean isOutside;
  private final double maxHot;
  private final double maxCold;
  private double currentTemperature;

  public Thermometer(){
    this.distance = 0;
    this.isOutside = true;
    this.maxHot = 0.0;
    this.maxCold = 0.0;

  };

  public Thermometer(int distance, boolean isOutside, int maxCold, int maxHot)
  {
    this.distance = distance;
    this.isOutside = isOutside;
    this.maxCold = maxCold;
    this.maxHot = maxHot;

    if(this.isOutside){
      this.currentTemperature = 20;
    }
  }




}
