package battlechar.enemy.seaenemy;

import battlechar.brave.Brave;
import spell.attackspell.Wota;
import text.Text;

public class CorpsFish extends SeaEnemy {
    public CorpsFish() {
        super("ぐんだんぎょ");
    }
    // メソッド
    public void turn(Brave brave) {     // ランダムで自分の行動を決める
        switch (decideAction(2)) {
            case 0:
                attack(brave);
                break;
            case 1:
                new Wota().resite(this, brave);
                break;
            case 2:
                break;
        }
    }
    public void gather() {
        System.out.println(getName() + "はなかまをあつめ、きょだいなさかなのようになった！");
        setInBattleAttack((int)(getInBattleAttack() * 1.25));
        System.out.println(getName() + "のこうげきりょくがすこしあがった！");
    }
}
