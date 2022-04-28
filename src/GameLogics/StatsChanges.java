package GameLogics;

public class StatsChanges {

    public int HpChange (int heroesHP, int damageReceived) {
        int finalHP = (heroesHP - damageReceived);
            if(finalHP <= 0){
                System.out.println("YOU HAVE BEEN DEFEATED!");
            } else {
                System.out.println("You have received" + damageReceived + " and have"+ finalHP + " HP left.");
            }
        return finalHP;
    }
}






