public class Procesor extends Components implements Timing{
    private static final int GROW_TEMPERATURE = 10;

    private int timingSpeed;
    private double temperatureTiming;
    private double criticalTemperatureTiming;

    public Procesor(String name, String producer, String id, int timingSpeed, double temperatureTiming, double criticalTemperatureTiming) {
        super(name, producer, id);
        this.timingSpeed = timingSpeed;
        this.temperatureTiming = temperatureTiming;
        this.criticalTemperatureTiming = criticalTemperatureTiming;
    }

    public int getTimingSpeed() {
        return timingSpeed;
    }

    public void setTimingSpeed(int timingSpeed) {
        this.timingSpeed = timingSpeed;
    }

    public double getTemperatureTiming() {
        return temperatureTiming;
    }

    public void setTemperatureTiming(double temperatureTiming) {
        this.temperatureTiming = temperatureTiming;
    }

    public double getCriticalTemperatureTiming() {
        return criticalTemperatureTiming;
    }

    public void setCriticalTemperatureTiming(double criticalTemperatureTiming) {
        this.criticalTemperatureTiming = criticalTemperatureTiming;
    }

    @Override
    public void timingUp() {
        if (getTemperatureTiming() < criticalTemperatureTiming){
            setTimingSpeed(getTimingSpeed() + Timing.UP_TIMING);
            setTemperatureTiming(getTemperatureTiming() + Timing.UP_TIMING / GROW_TEMPERATURE);
        } else {
            System.out.println("Temperatura krytyczna osiągnięta. Podkręcanie zatrzymane");
            setTemperatureTiming(criticalTemperatureTiming);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Procesor "+getName() + " ,producent " + getProducer() + " ,numer seryjny " + getId());
        sb.append(" ,prędkość taktowania " + timingSpeed + "MHz ,temperatura pracy " +temperatureTiming);
        sb.append(" ,temperatura krytyczna " + criticalTemperatureTiming);
        return sb.toString();
    }
}
