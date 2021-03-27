package hu.bme.mit.train.sensor;

import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainSensor;
import hu.bme.mit.train.interfaces.TrainUser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import org.mockito.Mockito.*;

import static org.mockito.Mockito.mock;
public class TrainSensorTest {

    TrainController controller;
    TrainSensor sensor;
    TrainUser user;

    @Before
    public void before() {

        controller = mock(TrainController.class);
        user = mock(TrainUser.class);
        sensor =  new TrainSensorImpl(controller, user);
        sensor.getSpeedLimit();

    }



    @Test
    public void SpeedLimitLowerThanZero() {
        sensor.overrideSpeedLimit(-2);
        verify(user).setAlarmState(true);
    }

    @Test
    public void SpeedLimitGreaterThanFivehundred() {
        sensor.overrideSpeedLimit(501);
        verify(user).setAlarmState(true);
    }

    @Test
    public void SpeedLimitRelativeFalse() {
        when(controller.getReferenceSpeed()).thenReturn(150);
        sensor.overrideSpeedLimit(50);
        verify(user).setAlarmState(true);
    }

    @Test

    public void SpeedLimitRelativeTrue() {
        when(controller.getReferenceSpeed()).thenReturn(50);
        sensor.overrideSpeedLimit(50);
        verify(user).setAlarmState(false);

    }
}
