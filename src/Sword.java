public class Sword extends Game implements IMethod{
    private double damage;

    Sword(String nama, int rank, double price, double damage) {
        super(nama, rank, price);
        this.damage = damage;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }


    @Override
    public String methodAttack() {
        return "Damage dealt by " + getDamage();
    }
}
