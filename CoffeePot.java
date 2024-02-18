public class CoffeePot {
    private IMediator mediator;

    public void setMediator(IMediator mediator) {
        this.mediator = mediator;
    }

    public void doCoffeePot() {
        System.out.println("I am coffe pot,... doing my task");
        mediator.notifyEventComplete("Coffee Pot");
    }
}