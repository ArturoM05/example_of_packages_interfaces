package beings.of.the.sky;

import beings.LivingBeing;
import beings.of.the.sky.SkyBeing;

public class Bird extends LivingBeing implements SkyBeing {

    @Override
    public void nacer() {
        System.out.println("El pájaro ha nacido.");
    }

    @Override
    public void crecer() {
        System.out.println("El pájaro está creciendo.");
    }

    @Override
    public void reproducir() {
        System.out.println("El pájaro se reproduce.");
    }

    @Override
    public void morir() {
        System.out.println("El pájaro ha muerto.");
    }

    @Override
    public void volar() {
        System.out.println("El pájaro vuela.");
    }

    @Override
    public void cambiarDimension() {
        System.out.println("El pájaro cambia de dimensión.");
    }
}
