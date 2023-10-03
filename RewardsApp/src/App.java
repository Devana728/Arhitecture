import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Fabric.GemGenerator;
import Fabric.GoldGenerator;
import Fabric.ItemGenerator;
import Fabric.SilverGenerator;
import Fabric.Ametistenerator;
import Fabric.BestRewardGenerator;
import Fabric.DiamondGenerator;
import Fabric.PearlGenerator;
import Fabric.PlatinumGenerator;


public class App {
    public static void main(String[] args) throws Exception {
        ItemGenerator f1 = new GoldGenerator();
        f1.openReward();

        List<ItemGenerator> generators = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            generators.add(new GoldGenerator());
        }
        for (int i = 0; i < 5; i++) {
            generators.add(new GemGenerator());
        }
        for (int i = 0; i < 20; i++) {
            generators.add(new SilverGenerator());
        }
        for (int i = 0; i < 15; i++) {
            generators.add(new AmetistGenerator());
        }
        for (int i = 0; i < 2; i++) {
            generators.add(new BestRewardGenerator());
        }
        for (int i = 0; i < 3; i++) {
            generators.add(new DiamondGenerator());
        }
        for (int i = 0; i < 20; i++) {
            generators.add(new PearlGenerator());
        }
        for (int i = 0; i < 10; i++) {
            generators.add(new PlatinumGenerator());
        }

        Random random = ThreadLocalRandom.current();
        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(85);
            generators.get(index).openReward();
        }

    }
}
