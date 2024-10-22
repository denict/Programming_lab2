package moves.status;
import ru.ifmo.se.pokemon.*;


public class CalmMind extends StatusMove {
    public CalmMind() {
        super(Type.NORMAL, 0, 1);

    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK, 1);
        p.setMod(Stat.SPECIAL_DEFENSE, 1);
    }

    @Override
    protected String describe() {
        return "is using CalmMind";
    }
}