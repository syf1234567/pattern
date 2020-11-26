package pattern_21_mediator;

public class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator _mediator) {
        this.mediator = _mediator;
    }
}
