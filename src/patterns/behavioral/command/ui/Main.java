package patterns.behavioral.command.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;

import patterns.behavioral.command.commands.TurnTVOff;
import patterns.behavioral.command.commands.TurnTVOn;
import patterns.behavioral.command.commands.VolumTVDown;
import patterns.behavioral.command.commands.VolumTVUp;
import patterns.behavioral.command.control.DeviceButton;
import patterns.behavioral.command.devices.Device;
import patterns.behavioral.command.devices.TV;

public class Main extends JFrame {
	private JButton switchOnTv = new JButton("Switch on TV");
	private JButton switchOffTv = new JButton("Switch off TV");
	private JButton volumeUpTv = new JButton("TV volume UP");
	private JButton volumDownTv = new JButton("TV volume DOWN");
	private JTextArea commandsDisplay = new JTextArea(20, 20);
	private Device tv = new TV();
	private TurnTVOn turnTVOn = new TurnTVOn(tv);
	private TurnTVOff turnTVOff = new TurnTVOff(tv);
	private VolumTVUp volumTVUp = new VolumTVUp(tv);
	private VolumTVDown volumTvDown = new VolumTVDown(tv);
	private DeviceButton deviceButton = new DeviceButton();

	public Main() {
		initUI(this.getContentPane());
		initActionListeners();
	}

	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				Main main = new Main();
				main.setVisible(true);
			}
		});
	}

	private void initActionListeners() {
		this.switchOnTv.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// System.out.println("sasa");
				deviceButton.setCommand(turnTVOn);
				deviceButton.press(commandsDisplay);
			}
		});

		this.switchOffTv.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				deviceButton.setCommand(turnTVOff);
				deviceButton.press(commandsDisplay);

			}
		});

		this.volumeUpTv.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				deviceButton.setCommand(volumTVUp);
				deviceButton.press(commandsDisplay);
			}
		});

		this.volumDownTv.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				deviceButton.setCommand(volumTvDown);
				deviceButton.press(commandsDisplay);
			}
		});
	}

	private void initUI(Container pane) {

		JScrollPane areaScrollPane = new JScrollPane(commandsDisplay);
		areaScrollPane
				.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		areaScrollPane.setPreferredSize(new Dimension(100, 100));

		commandsDisplay.setEditable(false);

		commandsDisplay.setSize(200, 200);

		JPanel buttonsPanel = new JPanel();
		buttonsPanel.add(switchOnTv);
		buttonsPanel.add(switchOffTv);
		buttonsPanel.add(volumeUpTv);
		buttonsPanel.add(volumDownTv);
		pane.add(new JPanel(), BorderLayout.PAGE_START);
		pane.add(areaScrollPane, BorderLayout.CENTER);
		pane.add(buttonsPanel, BorderLayout.PAGE_END);

		this.setSize(500, 500);
		this.setTitle("Command design pattern");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
	}
}
