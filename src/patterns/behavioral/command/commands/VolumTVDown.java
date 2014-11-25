package patterns.behavioral.command.commands;

import javax.swing.JTextArea;

import patterns.behavioral.command.devices.Device;

public class VolumTVDown implements Command{
	private Device device;
	
	public VolumTVDown(Device device){
		this.device = device;
	}
	@Override
	public void execute(JTextArea textArea) {
		this.device.volumDown(textArea);
	}

}
