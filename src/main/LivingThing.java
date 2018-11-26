package jp.ac.uryukyu.ie.185760;
public class LivingThing {
    String name;
    int hitoint;
    int attack;
    boolean dead;
    private String name;
    private int hitPoint;
    private iPnt attack;
    private boolean dead;
    public LivingThing( String name, int hitPoint, int attack ){
        this.name = name;
        this.hitPoint = hitPoint;
        @@ -16,11 +16,9 @@ public LivingThing( String name, int hitPoint, int attack ){
            public boolean isDead(){
                return dead;
            }
            public String getName(){
                return name;
            }
            public String getName(){ return name; }
            public void attack(LivingThing opponent){
                if(hitPoint > 0) {
                    if (isDead() == false) {
                        int damage = (int) (Math.random() * attack);
                        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
                        opponent.wounded(damage);
                        @ @ -33, 4 + 31, 10 @@public void wounded ( int damage){
                            System.out.printf("モンスター%sは倒れた。\n", name);
                        }
                    }
                    public void setName (String name){
                        this.name = name;
                    }
                    public int getHitPoint () {
                        return hitPoint;
                    }
                    public void setHitPoint ( int hitPoint){
                        this.hitPoint = hitPoint;
                    }
                    public int getAttack () {
                        return attack;
                    }
                    public void setAttack ( int attack){
                        this.attack = attack;
                    }
                    public void setDead ( boolean dead){
                        this.dead = dead;
                    }
                }
