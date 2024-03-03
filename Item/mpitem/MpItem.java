package item.mpitem;
import item.Item;

public class MpItem extends Item {
    private int healPoint;
    private int minHealPoint;
    private int healRange;

    // コンストラクタ
    public MpItem(String name, String explanation, int minHealPoint, int healRange) {
        super(name,explanation);
        this.minHealPoint = minHealPoint;
        this.healRange = healRange;
    }
    // メソッド
    public int use() {
        this.healPoint = new java.util.Random().nextInt(this.healRange) + this.minHealPoint;
        return this.healPoint;
    }
    // アクセサ
    public int getHealPoint() { return this.healPoint; }
    public void setHealPoint(int healPoint) { this.healPoint = healPoint; }
}
