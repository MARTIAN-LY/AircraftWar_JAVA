package edu.hitsz.aircraft;

import edu.hitsz.application.ImageManager;
import edu.hitsz.application.Main;

import java.util.Random;

public class SimpleEnemyFactory {
    public static AbstractAircraft createEnemy(int num) {
        Random random = new Random(System.currentTimeMillis());
        //默认普通敌机
        AbstractAircraft enemy = null;

        switch (num) {
            case 0:
                enemy = new MobEnemy(
                        random.nextInt(Main.WINDOW_WIDTH - ImageManager.ELITE_ENEMY_IMAGE.getWidth()),
                        random.nextInt(Main.WINDOW_HEIGHT / 10),
                        random.nextInt(3) - 2,        //普通敌机有一定的横向速度
                        6,
                        1                                           //普通敌机1滴血
                );
                break;
            case 1:
                enemy = new EliteEnemy(
                        random.nextInt(Main.WINDOW_WIDTH - ImageManager.ELITE_ENEMY_IMAGE.getWidth()),
                        random.nextInt(Main.WINDOW_HEIGHT / 10),
                        random.nextInt(5) - 2,        //精英敌机有一定的横向速度
                        7,                                          //精英敌机纵向速度稍快
                        3                                           //精英敌机3滴血
                );
                break;
            case 2:
                enemy = new BossEnemy(
                        random.nextInt(Main.WINDOW_WIDTH - ImageManager.ELITE_ENEMY_IMAGE.getWidth()),
                        random.nextInt(Main.WINDOW_HEIGHT / 10),
                        random.nextInt(5) - 2,        //Boss敌机有一定的横向速度
                        0,                                          //Boss敌机无纵向速度
                        100                                          //Boss敌机50滴血
                );
                break;
        }

        return enemy;
    }
}
