public class Sprinkler {
    private IMediator mediator;

    public void setMediator(IMediator mediator) {
        this.mediator = mediator;
    }

    public void doSprinkler() {
        System.out.println("I am sprinkler,... doing my task");
        mediator.notifyEventComplete("Sprinkler");
    }
}