package patterns.behavioral.command.control;

import javax.swing.JTextArea;

import patterns.behavioral.command.commands.Command;

public class DeviceButton {
	private Command command;

	public DeviceButton(Command command) {
		this.command = command;
	}

	public DeviceButton() {
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public void press(JTextArea textArea) {
		this.command.execute(textArea);
	}

	public void press(Command command, JTextArea textArea) {
		command.execute(textArea);
	}
}
