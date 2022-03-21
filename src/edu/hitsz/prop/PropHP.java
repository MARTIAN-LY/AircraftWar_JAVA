package edu.hitsz.prop;

import edu.hitsz.aircraft.AbstractAircraft;
import edu.hitsz.aircraft.HeroAircraft;
import edu.hitsz.application.Main;

import java.util.List;

public class PropHP extends AbstractProp {


    public PropHP(int locationX, int locationY, int speedX, int speedY) {
        super(locationX, locationY, speedX, speedY);
    }

    /**
     * 回血道具会让英雄机增加一滴血
     * 最多 5 滴
     * @param hero
     */
    @Override
    public void effect(HeroAircraft hero) {
        int hp = hero.getHp();
        if (hp < 5) {
            hero.setHp(hp + 1);
        }
        System.out.println("吃到回血道具");
        this.vanish();
    }

    @Override
    public void effect(List<AbstractAircraft> enemies) {

    }

}
