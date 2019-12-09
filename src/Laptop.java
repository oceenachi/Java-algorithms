public class Laptop {
    private String harddisk;
    private boolean isFaulty;
    private String laptopMake;

    public Laptop(String harddisk, String laptopMake) {
        this.harddisk = harddisk;
        this.isFaulty = false;
        this.laptopMake = laptopMake;
    }

    public String getHarddisk() {
        return this.harddisk;
    }

    public boolean isFaulty() {
        return this.isFaulty = !isFaulty;
    }

    public String getLaptopMake() {
        return laptopMake;
    }

}
