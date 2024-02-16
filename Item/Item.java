public abstract class Item {
    private String name;
    private String explanation;

    // コンストラクタ
    public Item(String name, String explanation) {
        this.name = name;
        this.explanation = explanation;
    }
    // 抽象メソッド
    public abstract void use(Brave b);
    // アクセサ
    public String getName() { return this.name; }
    public String getExplanation() { return this.explanation; }
    public void setName(String name) { this.name = name; }
    public void setExplanation(String explanation) { this.explanation = explanation; }
}