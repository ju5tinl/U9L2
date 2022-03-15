public class Dog extends Animal {
    private boolean walked;
    private boolean barked;

    public Dog(String n, int a, boolean v, boolean f, boolean w, boolean b){
        super(n,a,v,f);
        walked = w;
        barked = b;
    }

    public boolean isBarked() {
        return barked;
    }

    public void setBarked(boolean barked) {
        this.barked = barked;
    }

    public boolean hasBeenWalked (){
        return walked;
    }

    public void setWalked(boolean walked) {
        this.walked = walked;
    }

    public void walk(){
        System.out.println("I got walked!");
        walked = true;
    }
}
