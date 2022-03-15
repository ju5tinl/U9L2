public class Runner {
    public static void main(String[] args) {
        Animal myAnimal = new Animal("Das", 38, true, true);
        System.out.println(myAnimal.getName());
        System.out.println(myAnimal.getAge());
        myAnimal.adopt();
        myAnimal.feed();
        System.out.println();


        Dog myDog = new Dog("Danny", 17, true, true, true, true);
        System.out.println(myDog.getName());
        System.out.println(myDog.getAge());
        myDog.adopt();
        myDog.feed();
        myDog.hasBeenWalked();
        myDog.isBarked();
        System.out.println();


        Cat myCat = new Cat("Sumin", 17, true, true, false, 2);
        System.out.println(myCat.getName());
        System.out.println(myCat.getAge());
        myCat.adopt();
        myCat.feed();
        myCat.hasPlayedWith();
        System.out.println();



    }
}
