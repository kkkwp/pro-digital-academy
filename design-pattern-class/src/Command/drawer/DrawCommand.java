package Command.drawer;

import java.awt.*;

import Command.command.Command;

public class DrawCommand implements Command {

	// 그리는 대상
	protected Drawable drawable;

	// 그리는 위치
	private final Point position;

	public DrawCommand(Drawable drawable, Point position) {
		this.drawable = drawable;
		this.position = position;
	}

	@Override
	public void execute() {
		drawable.draw(position.x, position.y);
	}
}
