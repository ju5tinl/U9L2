public class Animal {
    private String name;
    private int age;
    private boolean vac;
    private boolean fluffy;

    public Animal(String n, int a, boolean v, boolean f){
        name = n;
        age = a;
        vac = v;
        fluffy = f;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isFluffy() {
        return fluffy;
    }

    public boolean isVac(){
        return vac;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setVac(boolean vac) {
        this.vac = vac;
    }

    public void setFluffy(boolean fluffy) {
        this.fluffy = fluffy;
    }

    public void adopt(){
        System.out.println("I got adopted!");
    }

    public void feed(){
        System.out.println("I have been fed!");
    }

}
