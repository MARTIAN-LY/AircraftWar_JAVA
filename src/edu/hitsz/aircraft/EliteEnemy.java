package edu.hitsz.aircraft;

import edu.hitsz.application.Main;
import edu.hitsz.bullet.BaseBullet;
import edu.hitsz.bullet.EnemyBullet;
import edu.hitsz.bullet.HeroBullet;

import java.util.LinkedList;
import java.util.List;

public class EliteEnemy extends AbstractAircraft {

    public EliteEnemy(int locationX, int locationY, int speedX, int speedY, int hp) {
        super(locationX, locationY, speedX, speedY, hp);
    }

    /**
     * 子弹一次发射数量
     */
    private int shootNum = 1;
    /**
     * 子弹伤害
     */
    private int power = 1;

    /**
     * 子弹射击方向 (向上发射：-1，向下发射：1)
     */
    private final int direction = 1;

    /**
     * 精英敌机射击，子弹速度快于敌机速度
     * @return
     */
    @Override
    public List<BaseBullet> shoot() {
        List<BaseBullet> res = new LinkedList<>();
        int x = this.getLocationX();
        int y = this.getLocationY() + direction * 2;
        int speedX = 0;
        int speedY = this.getSpeedY() + direction * 3;

        for (int i = 0; i < shootNum; i++) {
            // 子弹发射位置相对飞机位置向前偏移
            // 多个子弹横向分散
            res.add(new EnemyBullet(x + (i * 2 - shootNum + 1) * 10, y, speedX, speedY, power));
        }
        return res;
    }

    @Override
    public void forward() {
        super.forward();
        // 判定 y 轴向下飞行出界
        if (locationY >= Main.WINDOW_HEIGHT) {
            vanish();
        }
    }


}
