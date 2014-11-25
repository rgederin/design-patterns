package patterns.structural.adapter;

import java.util.Random;

public class EnemyTank implements EnemyAttacker {
	private Random random = new Random();

	@Override
	public void fireWeapon() {
		System.out.println("Enemy Tank Does " + (random.nextInt(10) + 1)
				+ " Damage");

	}

	@Override
	public void driveForward() {
		System.out.println("Enemy Tank Moves " + (random.nextInt(10) + 1)
				+ " Space");
	}

}
