package check;
import constants.Constants;

public class Check {
	private  static String firstName="座覇";
	private  static String lastName="音色";

	private static void printName(String firstName, String lastName) {
		System.out.println(firstName+ lastName);
	}

	public static void main(String[] args) {
		//Check check =new Check();
		System.out.println("printNameメソッド→ ");
		printName(firstName,lastName);
		//再提出追記
		//フィールドとprintNameメソッドをstaticにしたため、インスタンス化せずにprintNameメソッドを呼び出せるようになった。

		Pet p =new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		p.introduce();

		RobotPet r =new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		r.introduce();

	}
}
