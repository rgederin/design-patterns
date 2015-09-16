package patterns.structural.adapter;

public class Main {

	public static void main(String[] args) {
		EnemyAttacker tank = new EnemyTank();
		EnemyRobot robot = new EnemyRobot();
		EnemyAttacker robotAdapter = new RobotAdapter(robot);

		System.out.println("\t\nTank in Action\n");
		tank.fireWeapon();
		tank.driveForward();
		tank.fireWeapon();

		System.out.println("\t\nRobot in Action\n");
		robot.smashWithHands();
		robot.walkForward();
		robot.smashWithHands();

		System.out.println("\t\nRobot Adapter in Action\n");
		robotAdapter.fireWeapon();
		robotAdapter.driveForward();
		robotAdapter.fireWeapon();
	}

}
