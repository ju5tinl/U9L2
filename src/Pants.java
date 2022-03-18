public class Pants extends Clothes{
    private int pockets;

    public Pants(String b, boolean l, boolean s, int pockets){
        super(b,l,s);
        this.pockets = pockets;
    }

    public int getPockets() {
        return pockets;
    }

    public void setPockets(int pockets) {
        this.pockets = pockets;
    }
}
