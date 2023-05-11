public class Potion extends Game implements IMethod{
    private double duration;
    private double effectPoint;
    private String tipe;

    Potion(String nama, int rank, double price, double duration, double effectPoint, String tipe) {
        super(nama, rank, price);
        this.duration = duration;
        this. effectPoint = effectPoint;
        this.tipe = tipe;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getEffectPoint() {
        return effectPoint;
    }

    public void setEffectPoint(double effectPoint) {
        this.effectPoint = effectPoint;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    @Override
    public String methodAttack() {
        if(getTipe().equalsIgnoreCase("Attack")){
            return "Damage dealt by " + getEffectPoint();
        } else if (getTipe().equalsIgnoreCase("Heal")) {
            return "Healed by " + getEffectPoint();
        }else{
            return "Tipe potion tidak valid";
        }
    }
}
