package pokemons;

import moves.physical.FurySwipes;
import moves.status.Confide;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Chimchar extends Pokemon{

    public Chimchar(String name, int level) {
        super(name, level);

        super.setType(Type.FIRE);
        super.setStats(
                44, // hd
                58, // attack
                44, // defense
                58, // speed attack
                44, // speed defense
                61 // speed
        );
        FurySwipes furySwipes = new FurySwipes();
        Confide confide = new Confide();
        super.setMove(furySwipes, confide);
    }
}
