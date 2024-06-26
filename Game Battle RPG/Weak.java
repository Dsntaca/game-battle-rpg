//class Weak
public class Weak implements IStatusEffect{
    @Override
    public void applyStatus(Character target) {
        target.addStatusEffect(this);
    }

    @Override
    public int modifyDamage(int damage) {
        return damage + 10;
    }
}
