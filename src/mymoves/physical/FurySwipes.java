package mymoves.physical;
import ru.ifmo.se.pokemon.*;

public class FurySwipes extends PhysicalMove {
    public FurySwipes() {
        super(Type.NORMAL, 18, 0.8);

    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        double rand = Math.random();
        if (rand < 3d/8d) {
            p.setMod(Stat.HP, 72);
        } else if (rand < 6d/8d  && rand > 3d/8d) {
            p.setMod(Stat.HP, 162);
        } else if (rand < 7d/8d && rand > 6d/8d) {
            p.setMod(Stat.HP, 288);
        } else {
            p.setMod(Stat.HP, 450);
        }
    }

    @Override
    protected String describe() {
        return "is using FurySwipes";
    }
}
