package mymoves.physical;
import ru.ifmo.se.pokemon.*;


public class AquaTail extends PhysicalMove {
    public AquaTail() {
        super(Type.WATER, 90, 0.9);

    }

    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
    }

    @Override
    protected String describe() {
        return "is using AquaTail";
    }
}