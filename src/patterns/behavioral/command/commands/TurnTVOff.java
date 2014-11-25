package patterns.behavioral.command.commands;

import javax.swing.JTextArea;

import patterns.behavioral.command.devices.Device;

public class TurnTVOff implements Command {
	private Device device;

	public TurnTVOff(Device device) {
		this.device = device;
	}

	@Override
	public void execute(JTextArea textArea) {
		this.device.off(textArea);
	}
}
