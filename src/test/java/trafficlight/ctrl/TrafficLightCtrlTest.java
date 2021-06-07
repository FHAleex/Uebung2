package trafficlight.ctrl;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import trafficlight.states.State;

public class TrafficLightCtrlTest {

    @Test
    @DisplayName("Next state green")
    public void getNextStateTest_green(){
        TrafficLightCtrl tlc = new TrafficLightCtrl();
        State current = tlc.getGreenState();
        State actual = current.getNextState();
        assertEquals(tlc.getYellowState(), actual);
    }

    @Test
    @DisplayName("Next state yellow")
    public void getNextStateTest_yellow(){
        TrafficLightCtrl tlc = new TrafficLightCtrl();
        State current = tlc.getYellowState();
        State actual = current.getNextState();
        assertEquals(tlc.getGreenState(), actual);  //weil er ins else reingeht
    }

    @Test
    @DisplayName("Next state red")
    public void getNextStateTest_red(){
        TrafficLightCtrl tlc = new TrafficLightCtrl();
        State current = tlc.getRedState();
        State actual = current.getNextState();
        assertEquals(tlc.getYellowState(), actual);
    }
}
