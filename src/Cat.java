public class Cat extends Animal {
    private boolean played;
    private int whiskers;

    public Cat(String n, int a, boolean v, boolean f, boolean p, int w){
        super(n,a,v,f);
        played = p;
        whiskers = w;
    }

    public int getWhiskers() {
        return whiskers;
    }

    public void setWhiskers(int whiskers) {
        this.whiskers = whiskers;
    }

    public void play(){
        System.out.println("I have beeen played with");
        played = true;
    }

    public boolean hasPlayedWith(){
        return played;
    }
}
