public class Shield extends Game {
    private double damageBlock;

    Shield(String nama, int rank, double price, double damageBlock) {
        super(nama, rank, price);
        this.damageBlock = damageBlock;
    }

    public double getDamageBlock() {
        return damageBlock;
    }

    public void setDamageBlock(double damageBlock) {
        this.damageBlock = damageBlock;
    }

    public String methodDefense(){
        return "Damage Mitigated by " + getDamageBlock();
    }
}
