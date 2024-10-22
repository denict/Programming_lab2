package moves.physical;
import ru.ifmo.se.pokemon.*;

public class WaterFall extends PhysicalMove {
    public WaterFall() {
        super(Type.WATER, 80, 1);

    }

    protected static boolean chance(double d) {
        return d > Math.random();
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if (chance(0.2)) {
            Effect.flinch(p);
        }


    }

    @Override
    protected String describe() {
        return "is using WaterFall";
    }
}
