import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Robot {

    String robotName = "Harry";
    int walkingSpeed = 1;
    int runningSpeed = 4;
    int skippingSpeed = 2;
    int jumpingSpeed = 3;

    @Before
    public void setRobotName(String name) throws Exception{
        if (name == robotName){
            assertTrue(n.setRobotName(name).isEqual("Peter"));
        }else {
            this.robotName = name;
        }
        }

    @Before
    public void setWalkingSpeed(int speed) throws Exception{
        if (speed == walkingSpeed){
            assertTrue(s.setWalkingSpeed(speed).isEqual(walkingSpeed));
        }else{
            this.walkingSpeed = speed;
        }
    }

    @Before
    public void setRunningSpeed(int speed) throws Exception{
        if (speed == runningSpeed){
            assertTrue(s.setRunningSpeed(speed).isEqual(runningSpeed));
        }else{
            this.runningSpeed = speed;
        }
    }

    @Before
    public void setSkippingSpeed(int speed) throws Exception{
        if (speed == skippingSpeed){
            assertTrue(s.setSkippingSpeed(speed).isEqual(skippingSpeed));
        }else{
            this.skippingSpeed = speed;
        }
    }

    @Before
    public void setJumpingSpeed(int speed) throws Exception{
        if (speed == jumpingSpeed){
            assertTrue(s.setJumpingSpeed(speed).isEqual(jumpingSpeed));
        }else{
            this.jumpingSpeed = speed;
        }
    }


    public static int robotPosition(int a, int b ){
        return robotPosition(a, b);
    }

    @Test
    public void goButton()throws Exception{
        Robot r = new Robot();
        int firstPosition = 0;
        int secondPosition = 0;

        if (firstPosition < 0 && 0 > 4){
            assertTrue(r.setJumpingSpeed().equals("Error"));
        }

    }


}
