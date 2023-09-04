package state;

public class DayState implements State {

	// Singleton : 상태를 나타내는 클래스는 인스턴스를 하나씩만 만든다.
	// (상태가 변화할 때마다 새로운 인스턴스를 만들면 낭비)
	private static final DayState singleton = new DayState();

	private DayState() {
	}

	public static State getInstance() {
		return singleton;
	}

	/*
	// 시간 설정 : 여기서 상태 전환이 일어난다.
	@Override
	public void doClock(Context context, int hour) {
		if (hour < 9 || 17 <= hour) {
			context.changeState(NightState.getInstance());
		} else if (12 <= hour && hour < 13) {
			context.changeState(LunchState.getInstance());
		}
	}*/

	@Override
	public void doUse(Context context) {
		context.recordLog("금고 사용(주간)");
	}

	@Override
	public void doAlarm(Context context) {
		context.callSecurityCenter("비상벨(주간)");
	}

	@Override
	public void doPhone(Context context) {
		context.callSecurityCenter("일반 통화(주간)");
	}

	@Override
	public String toString() {
		return "[주간]";
	}
}
