public class MemoryRam extends Components{
    private int memoryRam;
    private int timingMemoryRam;
    private double temperatureTimingMemoryRam;
    private double criticalTemperatureTimingMemoryRam;

    public MemoryRam(String name, String producer, String id, int memoryRam, int timingMemoryRam, double temperatureTimingMemoryRam, double criticalTemperatureTimingMemoryRam) {
        super(name, producer, id);
        this.memoryRam = memoryRam;
        this.timingMemoryRam = timingMemoryRam;
        this.temperatureTimingMemoryRam = temperatureTimingMemoryRam;
        this.criticalTemperatureTimingMemoryRam = criticalTemperatureTimingMemoryRam;
    }

    public int getMemoryRam() {
        return memoryRam;
    }

    public void setMemoryRam(int memoryRam) {
        this.memoryRam = memoryRam;
    }

    public int getTimingMemoryRam() {
        return timingMemoryRam;
    }

    public void setTimingMemoryRam(int timingMemoryRam) {
        this.timingMemoryRam = timingMemoryRam;
    }

    public double getTemperatureTimingMemoryRam() {
        return temperatureTimingMemoryRam;
    }

    public void setTemperatureTimingMemoryRam(double temperatureTimingMemoryRam) {
        this.temperatureTimingMemoryRam = temperatureTimingMemoryRam;
    }

    public double getCriticalTemperatureTimingMemoryRam() {
        return criticalTemperatureTimingMemoryRam;
    }

    public void setCriticalTemperatureTimingMemoryRam(double criticalTemperatureTimingMemoryRam) {
        this.criticalTemperatureTimingMemoryRam = criticalTemperatureTimingMemoryRam;
    }
}
