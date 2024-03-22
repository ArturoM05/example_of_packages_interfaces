package beings.of.the.earth;

import beings.LivingBeing;
import beings.of.the.sky.SkyBeing;

public class Human extends LivingBeing implements EarthBeing, SkyBeing {

    @Override
    public void nacer() {
        System.out.println("El humano ha nacido.");
    }

    @Override
    public void crecer() {
        System.out.println("El humano está creciendo.");
    }

    @Override
    public void reproducir() {
        System.out.println("El humano se reproduce.");
    }

    @Override
    public void morir() {
        System.out.println("El humano ha muerto.");
    }

    @Override
    public void volar() {
        System.out.println("El humano vuela.");
    }

    @Override
    public void cambiarDimension() {
        System.out.println("El humano cambia de dimensión.");
    }
}
