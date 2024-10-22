package moves.status;
import ru.ifmo.se.pokemon.*;


public class SlackOff extends StatusMove {
    public SlackOff() {
        super(Type.NORMAL, 0, 1);

    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.HP, (int) Math.round(-50*Math.random()));
    }

    @Override
    protected String describe() {
        return "is using Confide";
    }
}