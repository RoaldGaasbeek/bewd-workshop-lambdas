package nl.han.bewd.lambdas.reis;


public class TrebuchetVervoerStrategy implements VervoerStrategy {
    @Override
    public int berekenReistijd(boolean isReisTijdensSpits) {
        if (isReisTijdensSpits) {
            return 3;
        } else {
            return 2;
        }
    }
}
