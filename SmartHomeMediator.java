public class SmartHomeMediator implements IMediator {
    private Alarm alarm;
    private Sprinkler sprinkler;
    private CoffeePot coffeePot;

    public SmartHomeMediator() {
        this.alarm = alarm;
        this.sprinkler = sprinkler;
        this.coffeePot = coffeePot;
    }

    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

    public void setSprinkler(Sprinkler sprinkler) {
        this.sprinkler = sprinkler;
    }

    public void setCoffeePot(CoffeePot coffeePot) {
        this.coffeePot = coffeePot;
    }

    @Override
    public void triggerAlarm() {
        System.out.println("Alarm is sending event to all...");
        sprinkler.doSprinkler();
        coffeePot.doCoffeePot();
    }

    @Override
    public void notifyEventComplete(String component) {
        System.out.println("Alarm event ended from " + component);
    }
}
