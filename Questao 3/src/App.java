public class App {
    public static void main(String[] args) throws Exception {
       
        Animal[] animais = new Animal[3];
        animais[0] = new Cachorro();
        animais[1] = new Gato();
        animais[2] = new Vaca();
        
        for (Animal animal : animais) {
            animal.makeSound();
        }
        
    }
}
