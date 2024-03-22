import beings.creators.LivingBeingCreator;
import beings.of.the.earth.Animal;
import beings.of.the.earth.Human;
import beings.of.the.sky.Bird;


public class Main {
    public static void main(String[] args) {
        // Crear una instancia de LivingBeingCreator
        LivingBeingCreator creator = new LivingBeingCreator();

        // Ejemplo: Crear un humano
        Human human = (Human) creator.createLivingBeing("human");
        human.nacer();
        human.crecer();
        human.reproducir();
        human.volar();
        human.morir();

        // Ejemplo: Crear un animal
        Animal animal = (Animal) creator.createLivingBeing("animal");
        animal.nacer();
        animal.crecer();
        animal.rugir();
        animal.reproducir();
        animal.morir();

        // Ejemplo: Crear un pájaro
        Bird bird = (Bird) creator.createLivingBeing("bird");
        bird.nacer();
        bird.volar();
        bird.crecer();
        bird.reproducir();
        bird.morir();
    }
}
