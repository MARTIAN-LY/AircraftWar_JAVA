package edu.hitsz.aircraft;

import edu.hitsz.bullet.BaseBullet;
import edu.hitsz.bullet.EnemyBullet;

import java.util.LinkedList;
import java.util.List;

public class BossEnemy extends AbstractAircraft {
    public BossEnemy(int locationX, int locationY, int speedX, int speedY, int hp) {
        super(locationX, locationY, speedX, speedY, hp);
    }

    /**
     * 子弹一次发射数量
     */
    private int shootNum = 3;

    /**
     * 子弹伤害
     */
    private int power = 1;

    /**
     * 子弹射击方向 (向上发射：-1，向下发射：1)
     */
    private final int direction = 1;

    /**
     * Boss射击，子弹速度快于敌机速度
     * @return
     */
    @Override
    public List<BaseBullet> shoot() {
        List<BaseBullet> res = new LinkedList<>();
        int x = this.getLocationX();
        int y = this.getLocationY() + this.getHeight() / 2;
        int speedX = this.getSpeedX();
        int speedY = direction * 10;

        //Boss三条弹道
        res.add(new EnemyBullet(x + (2 - shootNum + 1) * 10, y, -(speedX + 1), speedY, power));
        res.add(new EnemyBullet(x + (4 - shootNum + 1) * 10, y, 0, speedY, power));
        res.add(new EnemyBullet(x + (6 - shootNum + 1) * 10, y, (speedX + 1), speedY, power));

        return res;
    }

}
