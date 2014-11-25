package patterns.behavioral.command.commands;

import javax.swing.JTextArea;

import patterns.behavioral.command.devices.Device;

public class TurnTVOn implements Command {
	private Device device;

	public TurnTVOn(Device device) {
		this.device = device;
	}

	@Override
	public void execute(JTextArea textArea) {
		this.device.on(textArea);
	}
}
