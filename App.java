public class App {
    public static void main(String[] args) {
        Alarm alarm = new Alarm();
        Sprinkler sprinkler = new Sprinkler();
        CoffeePot coffeePot = new CoffeePot();
        SmartHomeMediator mediator = new SmartHomeMediator();
        mediator.setAlarm(alarm);
        mediator.setSprinkler(sprinkler);
        mediator.setCoffeePot(coffeePot);

        alarm.setMediator(mediator);
        sprinkler.setMediator(mediator);
        coffeePot.setMediator(mediator);

        alarm.trigger();
    }
}