package moves.status;
import ru.ifmo.se.pokemon.*;


public class SwordsDance extends StatusMove {
    public SwordsDance() {
        super(Type.NORMAL, 0, 1);

    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, 2);
    }

    @Override
    protected String describe() {
        return "is using SwordsDance";
    }
}