package Composition;

public class Bedroom {
    public int bed;
    public int cupboard;
    public int fan;

    public Bedroom(int bed, int cupboard, int fan) {
        this.bed = bed;
        this.cupboard = cupboard;
        this.fan = fan;
    }

    public int getBed() {
        return bed;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }

    public int getCupboard() {
        return cupboard;
    }

    public void setCupboard(int cupboard) {
        this.cupboard = cupboard;
    }

    public int getFan() {
        return fan;
    }

    public void setFan(int fan) {
        this.fan = fan;
    }
}
