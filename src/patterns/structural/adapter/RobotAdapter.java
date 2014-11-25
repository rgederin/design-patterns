package patterns.structural.adapter;

public class RobotAdapter implements EnemyAttacker {
	private NewEnemyRobot robot;

	public RobotAdapter(NewEnemyRobot robot) {
		this.robot = robot;
	}

	@Override
	public void fireWeapon() {
		this.robot.smashWithHands();

	}

	@Override
	public void driveForward() {
		this.robot.walkForward();

	}

}
