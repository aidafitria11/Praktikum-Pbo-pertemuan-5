public class Dog extends Animal implements Pet {
    @Override
    public void setName(String name){
        System.out.println("Dog's name is:" + name);
    }

    @Override
    public void play() {
        System.out.println("Dog is playing.");
    }

    @Override
public void eat(){
    System.out.println("Dog is walking");
}
}
