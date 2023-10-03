package Fabric;

import Interface.iGameItem;
import Product.Ametist;

public class AmetistGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Ametist();
    }
    
}
