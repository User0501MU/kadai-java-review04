
//Humanクラスは、Animal クラスを継承

//趣味の情報を保管するフィールドを定義せよ（変数名自由）でカプセル化をせよ！

//Humanクラスのインスタンスを3つ作成、それぞれ、変数名は tanaka・suzuki・sato
//インスタンス化の復習 new演算子を用いてのインスタンス化

//別パッケージのクラスを利用する場合、import文が必要
//+Humanクラスにはスーパークラス（Animal）の継承とインターフェイスの実装が必要

package animal;
//public class Aクラス名 extends B親クラス implements C親インターフェイス { ... }
//スーパークラスの継承とインターフェイスの実装を両方同時に指定できます。extendsをimplementsより先に書く必要があり
public class Human extends Animal implements Thinkable {
    private String hobby;

    //サブクラス：Humanコンストラクタ　趣味を含めた引数
    public Human(String name, int age, String hobby) {
        super(name, age);//Animal（親）から呼び出しメソッドを明示
        this.hobby = hobby;//subクラス
    }
//オーバーライドとはスーパークラスにあるメソッドをサブクラスで再定義　趣味hobby
    @Override
    public void think() {
        System.out.println("私は" + hobby + "について考えています。");
    }
}
