public class Alarm {
    private IMediator mediator;

    public void setMediator(IMediator mediator) {
        this.mediator = mediator;
    }

    public void trigger() {
        mediator.triggerAlarm();
    }
}