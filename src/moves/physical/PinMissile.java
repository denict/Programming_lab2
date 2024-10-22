package moves.physical;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class PinMissile extends PhysicalMove {
    public PinMissile() {
        super(Type.BUG, 25, 0.95);

    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        double rand = Math.random();
        if (rand < 3d/8d) {
            p.setMod(Stat.HP, 100);
        } else if (rand < 6d/8d  && rand > 3d/8d) {
            p.setMod(Stat.HP, 225);
        } else if (rand < 7d/8d && rand > 6d/8d) {
            p.setMod(Stat.HP, 400);
        } else {
            p.setMod(Stat.HP, 625);
        }
    }

    @Override
    protected String describe() {
        return "is using Pin Missile";
    }

    
}