package moves.physical;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade() {
    super(Type.NORMAL, 70, 1);

}

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        switch (p.getCondition()) {
            case BURN:
            case POISON:
            case PARALYZE:
                p.setMod(Stat.HP, 70);

        }


    }

    @Override
    protected String describe() {
        return "is using Facade";
    }
}
