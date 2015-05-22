public class vehicle {
  private float distance;
  private float speed;
  private float acceleration;
  private float time;
  private float constant;
  private float airResistance;
  
  public float setAcceleration(float a) {
    acceleration = a;
    return a;
  }
  
  public float setResistance(float r) {
    airResistance = r;
    return r;
  }
  
  public float calcSpeed(float s, float t, float C) {
    time = t;
    speed = s;
    constant = C;
    
    s = acceleration*t - airResistance*t + C;
    return s;
  }
  
  public float calcDistance(float d, float t, float C) {
    distance = d;
    time = t;
    constant = C;
    
    d = (acceleration * t * t)/2 - (airResistance * t * t)/2+ t + C;
    return d;
  }
}