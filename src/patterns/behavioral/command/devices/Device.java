package patterns.behavioral.command.devices;

import javax.swing.JTextArea;

public interface Device {
	public void on(JTextArea textArea);

	public void off(JTextArea textArea);

	public void volumUp(JTextArea textArea);

	public void volumDown(JTextArea textArea);
}
