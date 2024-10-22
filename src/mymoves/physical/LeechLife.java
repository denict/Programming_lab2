package mymoves.physical;
import ru.ifmo.se.pokemon.*;

public class LeechLife extends PhysicalMove {
    public LeechLife() {
        super(Type.BUG, 80, 1);

    }

    protected static boolean chance(double d) {
        return d > Math.random();
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.HP, -40);
    }

    @Override
    protected String describe() {
        return "is using LeechLife";
    }
}
