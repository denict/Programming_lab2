package moves.special;
import ru.ifmo.se.pokemon.*;


public class AcidSpray extends SpecialMove {
    public AcidSpray() {
        super(Type.POISON, 40, 1);

    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        Effect e = new Effect().stat(Stat.SPECIAL_DEFENSE, -2);
        p.addEffect(e);

    }

    @Override
    protected String describe() {
        return "is using AcidSpray";
    }
}