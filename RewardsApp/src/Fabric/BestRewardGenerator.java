package Fabric;

import Interface.iGameItem;
import Product.BestReward;

public class BestRewardGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
       return new BestReward();
    }
    
}
