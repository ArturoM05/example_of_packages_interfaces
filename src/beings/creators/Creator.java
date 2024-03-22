package beings.creators;

import beings.LivingBeing;

public interface Creator {
    LivingBeing createLivingBeing();

    LivingBeing createLivingBeing(String type);
}
