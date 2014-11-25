package patterns.behavioral.command.commands;

import javax.swing.JTextArea;

import patterns.behavioral.command.devices.Device;

public class VolumTVUp implements Command{
	private Device device;
	
	public VolumTVUp(Device device){
		this.device = device;
	}
	@Override
	public void execute(JTextArea textArea) {
		this.device.volumUp(textArea);
	}

}
