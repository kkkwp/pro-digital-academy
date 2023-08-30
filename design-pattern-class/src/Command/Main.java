package Command;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

import Command.command.Command;
import Command.command.MacroCommand;
import Command.drawer.DrawCanvas;
import Command.drawer.DrawCommand;

public class Main extends JFrame implements MouseMotionListener, WindowListener {

	// 이력
	private final MacroCommand history = new MacroCommand();
	private final DrawCanvas canvas = new DrawCanvas(400, 400, history);
	private final JButton clearButton = new JButton("clear");

	public Main(String title) {
		super(title);

		this.addWindowListener(this);
		canvas.addMouseMotionListener(this);
		clearButton.addActionListener(e -> {
			history.clear();
			canvas.repaint();
		});

		Box buttonBox = new Box(BoxLayout.X_AXIS);
		buttonBox.add(clearButton);
		Box mainBox = new Box(BoxLayout.Y_AXIS);
		mainBox.add(buttonBox);
		mainBox.add(canvas);
		getContentPane().add(mainBox);

		pack();
		setVisible(true);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		Command cmd = new DrawCommand(canvas, e.getPoint());
		history.append(cmd);
		cmd.execute();
	}

	@Override
	public void mouseMoved(MouseEvent e) {

	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowOpened(WindowEvent e) {

	}

	@Override
	public void windowClosed(WindowEvent e) {

	}

	@Override
	public void windowIconified(WindowEvent e) {

	}

	@Override
	public void windowDeiconified(WindowEvent e) {

	}

	@Override
	public void windowActivated(WindowEvent e) {

	}

	@Override
	public void windowDeactivated(WindowEvent e) {

	}

	public static void main(String[] args) {
		new Main("Command Pattern Sample");
	}
}
