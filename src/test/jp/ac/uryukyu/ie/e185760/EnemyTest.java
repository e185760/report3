package jp.ac.uryukyu.ie.e185760;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnemyTest {

    @Test
    void attack() {
        int heroHP = 10;
        Hero hero = new Hero("テスト勇者", heroHP, 5);
        Enemy enemy = new Enemy("テストスライム", 6, 3);
        enemy.setDead(true);
        for(int i=0; i<10; i++) {
            enemy.attack(hero); //乱数で0ダメージとなることもあるため、複数回実行してみる。
        }
        assertEquals(heroHP, hero.getHitPoint());
    }
}
//変更前 l.14 enemy.dead = true;
//      l.16 enemy.attack(hero); //乱数で0ダメージとなることもあるため、複数回実行してみる。
//      l.18 assertEquals(heroHP, hero.hitPoint);