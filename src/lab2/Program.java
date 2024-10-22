package lab2;
// variant
import mypokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
public class Program {
    public static void main(String[] args) {
        Battle b = new Battle();
        Qwilfish p1 = new Qwilfish("neomun", 100);
        Wimpod p2 = new Wimpod("wim", 100);
        Golisopod p3 = new Golisopod("titan", 100);
        Chimchar p4 = new Chimchar("makaka", 100);
        Monferno p5 = new Monferno("angry", 100);
        Infernape p6 = new Infernape("helicopter", 100);
        b.addAlly(p1);
        b.addAlly(p3);
        b.addAlly(p5);
        b.addFoe(p2);
        b.addFoe(p4);
        b.addFoe(p6);

        b.go();

    }
}
