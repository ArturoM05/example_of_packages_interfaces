// LivingBeingCreator.java
package beings.creators;
import beings.of.the.earth.Human;
import beings.of.the.earth.Animal;
import beings.of.the.sky.Bird;
import beings.LivingBeing;

public class LivingBeingCreator implements Creator {

    @Override
    public LivingBeing createLivingBeing() {
        return null;
    }

    @Override
    public LivingBeing createLivingBeing(String type) {
        switch(type) {
            case "human":
                return new Human();
            case "animal":
                return new Animal();
            case "bird":
                return new Bird();
            default:
                throw new IllegalArgumentException("Tipo de ser vivo no válido: " + type);
        }
    }
}