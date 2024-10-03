public class Main {
    
        public static void main(String[] args) {
            Spider labalaba = new Spider();
            labalaba.walk();
            labalaba.eat();
        
            Cat garfil = new Cat();
            garfil.setName("Garfil");
            garfil.play();

            Dog molly = new Dog();
            molly.setName("Molly");
            molly.play();
            molly.eat();
            molly.walk();
        }
 }