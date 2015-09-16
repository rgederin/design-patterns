package patterns.structural.adapter;

public class RobotAdapter implements EnemyAttacker {
	private EnemyRobot robot;

	public RobotAdapter(EnemyRobot robot) {
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
