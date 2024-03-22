package beings.of.the.earth;

import beings.LivingBeing;
import beings.of.the.earth.EarthBeing;

public class Animal extends LivingBeing implements EarthBeing {

    @Override
    public void nacer() {
        System.out.println("El animal ha nacido.");
    }

    @Override
    public void crecer() {
        System.out.println("El animal está creciendo.");
    }

    @Override
    public void reproducir() {
        System.out.println("El animal se reproduce.");
    }

    @Override
    public void morir() {
        System.out.println("El animal ha muerto.");
    }

    public void rugir(){
        System.out.println("El animal ruge.");
    }
}
