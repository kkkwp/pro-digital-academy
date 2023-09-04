package state;

public enum Clock {
	DAY(9, 17),
	LUNCH(12, 13),
	NIGHT(0, 8, 18, 23);

	private final int[] hours;

	Clock(int... hours) {
		this.hours = hours;
	}

	public boolean isWithinRange(int hour) {
		for (int h : hours) {
			if (hour == h) {
				return true;
			}
		}
		return false;
	}
}
