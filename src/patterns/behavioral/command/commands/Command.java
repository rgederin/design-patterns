package patterns.behavioral.command.commands;

import javax.swing.JTextArea;

public interface Command {
	public void execute(JTextArea textArea);
}
