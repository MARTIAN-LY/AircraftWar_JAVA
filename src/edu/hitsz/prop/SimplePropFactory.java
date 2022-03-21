package edu.hitsz.prop;

import edu.hitsz.application.ImageManager;
import edu.hitsz.application.Main;

import java.util.Random;

public class SimplePropFactory {
    public static AbstractProp createProp(int num) {

        AbstractProp prop = null;
        Random random = new Random(System.currentTimeMillis());
        switch (num) {
            case 0:
                prop = new PropBomb(
                        random.nextInt(Main.WINDOW_WIDTH - ImageManager.PROP_BOMB_IMAGE.getWidth()),
                        random.nextInt(Main.WINDOW_HEIGHT / 10),
                        random.nextInt(5) - 2,        //道具的横向速度
                        5                                           //道具纵向速度
                );
                break;
            case 1:
                prop = new PropFire(random.nextInt(Main.WINDOW_WIDTH - ImageManager.PROP_BOMB_IMAGE.getWidth()),
                        random.nextInt(Main.WINDOW_HEIGHT / 10),
                        random.nextInt(5) - 2,        //道具的横向速度
                        5                                           //道具纵向速度
                );
                break;
            case 2:
                prop = new PropHP(random.nextInt(Main.WINDOW_WIDTH - ImageManager.PROP_BOMB_IMAGE.getWidth()),
                        random.nextInt(Main.WINDOW_HEIGHT / 10),
                        random.nextInt(5) - 2,        //道具的横向速度
                        5                                           //道具纵向速度
                );
                break;
        }
        return prop;
    }
}
