package check;
import constants.Constants;

public class Check {
	private String firstName="座覇";
	private String lastName="音色";

	private void printName(String firstName, String lastName) {
		System.out.println(firstName+ lastName);
	}

	public static void main(String[] args) {
		Check check =new Check();
		System.out.print("printNameメソッド→");
		check.printName(check.firstName,check.lastName);

		Pet p =new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		p.introduce();

		RobotPet r =new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		r.introduce();

	}
}
