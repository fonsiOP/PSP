import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int num= Math.abs(rand.nextInt(3));
		System.out.println(num);

	}

}
