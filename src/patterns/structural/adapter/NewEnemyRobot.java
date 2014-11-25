package patterns.structural.adapter;

import java.util.Random;

public class NewEnemyRobot {
	private Random random = new Random();

	public void smashWithHands() {
		System.out.println("Enemy Robot Does " + (random.nextInt(100) + 1)
				+ " Damage With Its Hands");
	}

	public void walkForward() {
		System.out.println("Enemy Robot Wolks Forward "
				+ (random.nextInt(5) + 1) + " Spaces");
	}
}
