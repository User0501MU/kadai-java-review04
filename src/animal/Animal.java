
//Humanクラスの親となるクラス 変数名は自由 カプセル化

//Humanクラスの親となるクラスです。animalパッケージの中に作成します。mainメソッドは不要です。名前を格納するフィールドと年齢を格納するフィールドを定義してください
//カプセル化,変数名は自由

//コンストラクタに名前・年齢の情報を格納する引数を設定し、※?処理内容として名前・年齢の各フィールドを引数の情報で初期化？するようにしてください。引数の名前は自由とします

//say という名前のpublicなメソッドを定義してください。
//このメソッドを実行すると、フィールドに代入された名前と年齢を使って ○○です。△△歳です。 と画面に System.out.println() で表示するように処理を作りましょう（戻り値の指定は不要です）

/*まずはAnimalクラス（Animal.java）とReview04クラス
 （Review04.java）だけで成立させることを考えてみましょう。また、その場合はコンストラクタも定義し、
  Animalクラスのインスタンスを生成した際に2つの引数を受け取るようにしましょう。
  */

package animal;
//親クラス
public class Animal {
    private String name;
    private int age;
//this.メソッドを明示
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void say() {
        System.out.println(name + "です。" + age + "歳です。");
    }
}

