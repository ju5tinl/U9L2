public class Shirts extends Clothes{
    private boolean sleeves;

    public Shirts(String brand, boolean l, boolean s, boolean sleeves){
        super(brand,l,s);
        this.sleeves = sleeves;
    }

    public boolean isSleeves() {
        return sleeves;
    }

    public void des(){
        boolean t = isL();
        if(t == true){
            System.out.println("I have long sleeves on!");
        }
        else{
            System.out.println("I have short sleeves on!");
        }
    }

    public void setSleeves(boolean sleeves) {
        this.sleeves = sleeves;
    }
}
