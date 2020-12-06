package myAbilki;
import ru.ifmo.se.pokemon.*;
public class SwordsDance extends StatusMove {
    public SwordsDance() {
        super(Type.NORMAL, 0, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK, -1);
    }
    protected java.lang.String describe() {
        return "SCHA ZAREJUU";
    }
}