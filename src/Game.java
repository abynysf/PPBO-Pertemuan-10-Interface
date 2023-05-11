public class Game {
    private String nama;
    private int rank;
    private double price;
    Game(String nama, int rank, double price){
        this.nama = nama;
        this. rank = rank;
        this.price = price;
    }
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
