package patterns.behavioral.command.devices;

import javax.swing.JTextArea;

public class TV implements Device {
	private int volume = 0;

	@Override
	public void on(JTextArea textArea) {
		String currentText = textArea.getText();
		textArea.setText(currentText + "TV is ON\n");
	}

	@Override
	public void off(JTextArea textArea) {
		String currentText = textArea.getText();
		textArea.setText(currentText + "TV is OFF\n");
	}

	@Override
	public void volumUp(JTextArea textArea) {
		String currentText = textArea.getText();
		if (volume >= 10) {
			textArea.setText(currentText + "The volume is on maximum\n");
		} else {
			volume++;
			textArea.setText(currentText + "Volum UP. Current volume: "
					+ this.volume + "\n");
		}
	}

	@Override
	public void volumDown(JTextArea textArea) {
		String currentText = textArea.getText();
		if (volume <= 0) {
			textArea.setText(currentText + "The volume is on minimum\n");
		} else {
			volume--;
			textArea.setText(currentText + "Volum DOWN. Current volume: "
					+ this.volume);
		}
	}
}
