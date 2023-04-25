package Task09;

public interface Calculating<N extends NumberValue> {
    N sum(N v);

    N sub(N v);

    N mul(N v);

    N div(N v);
}
