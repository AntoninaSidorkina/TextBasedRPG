package GameLogics;

public class DamageCalculation {
    public int damageDoes (int heroDMG, int mobArmor) {
        int damageReceived = (heroDMG - mobArmor);
        if(damageReceived <= 0){
            damageReceived = 0;
        }
        return damageReceived;
    }
    public int DamageTakes (int mobDamage, int heroArmor){
        int damageReceived = (mobDamage - heroArmor);
        if(damageReceived <= 0){
            damageReceived = 0;
        }
        return damageReceived;
    }
}
