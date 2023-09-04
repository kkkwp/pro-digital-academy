package state;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Context를 구현한 클래스, UI를 가짐
 */
public class SafeFrame extends Frame implements Context {

	private final TextField textClock = new TextField(60);
	private final TextArea textScreen = new TextArea(10, 60);

	private final Map<Clock, State> stateMap = new HashMap<>();
	private State state;

	public SafeFrame(String title) {
		super(title);

		stateMap.put(Clock.DAY, DayState.getInstance());
		stateMap.put(Clock.LUNCH, LunchState.getInstance());
		stateMap.put(Clock.NIGHT, NightState.getInstance());
		state = stateMap.get(Clock.DAY);

		setBackground(Color.lightGray);
		setLayout(new BorderLayout());

		add(textClock, BorderLayout.NORTH);
		textClock.setEditable(false);

		add(textScreen, BorderLayout.CENTER);
		textScreen.setEditable(false);

		Panel panel = new Panel();
		Button buttonUse = new Button("use safe");
		panel.add(buttonUse);
		Button buttonAlarm = new Button("emergency");
		panel.add(buttonAlarm);
		Button buttonPhone = new Button("call");
		panel.add(buttonPhone);
		Button buttonExit = new Button("exit");
		panel.add(buttonExit);
		add(panel, BorderLayout.SOUTH);

		buttonUse.addActionListener(e -> state.doUse(this));
		buttonAlarm.addActionListener(e -> state.doAlarm(this));
		buttonPhone.addActionListener(e -> state.doPhone(this));
		buttonExit.addActionListener(e -> System.exit(0));

		pack();
		setVisible(true);
	}

	// 시간 설정
	@Override
	public void setClock(int hour) {
		String clockstring = String.format("현재 시간은 %02d:00", hour);
		System.out.println(clockstring);
		textClock.setText(clockstring);

		for (Map.Entry<Clock, State> entry : stateMap.entrySet()) {
			if (entry.getKey().isWithinRange(hour)) {
				changeState(entry.getValue());
				break;
			}
		}
		// state.doClock(this, hour);
	}

	// 상태 전환
	@Override
	public void changeState(State state) {
		System.out.println(this.state + "에서 " + state + "으로 상태가 전환되었습니다.");
		this.state = state;
	}

	@Override
	public void callSecurityCenter(String msg) {
		textScreen.append("call! " + msg + "\n");
	}

	@Override
	public void recordLog(String msg) {
		textScreen.append("record... " + msg + "\n");
	}
}
