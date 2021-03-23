package hu.bme.mit.train.interfaces;

public interface TrainUser {

	int getJoystickPosition();

	boolean getAlarmFlag();

	boolean getAlarmState();

	void setAlarmState(boolean alarmState);

	boolean newFeature();

	void overrideJoystickPosition(int joystickPosition);

}
