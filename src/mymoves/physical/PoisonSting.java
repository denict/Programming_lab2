package mymoves.physical;

import ru.ifmo.se.pokemon.*;

public class PoisonSting extends PhysicalMove {
    public PoisonSting() {
        super(Type.POISON, 15, 1);

    }
    protected static boolean chance(double d) {
        return d > Math.random();
    }

    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if (chance(0.1)) {
            Effect.poison(p);
        }
    }

    @Override
    protected String describe() {
        return "is using AcidSpray";
    }
}
