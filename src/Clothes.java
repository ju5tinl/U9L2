public class Clothes {
    private String brand;
    private boolean l;
    private boolean s;

    public Clothes(String brand, boolean l, boolean s){
        this.brand = brand;
        this.l = l;
        this.s = s;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isL() {
        return l;
    }

    public void setL(boolean l) {
        this.l = l;
    }

    public boolean isS() {
        return s;
    }

    public void setS(boolean s) {
        this.s = s;
    }

    public void buy(){
        System.out.println("I bought something!");
    }

    public void Return(){
        System.out.println("I returned something!");
    }
}

