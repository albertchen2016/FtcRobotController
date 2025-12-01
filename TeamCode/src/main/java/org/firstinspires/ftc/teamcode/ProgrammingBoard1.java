package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DigitalChannel;

@TeleOp
public class ProgrammingBoard1 {
    private DigitalChannel touchSensor;

//    public void init(hardwareMap hwMap){
//        touchSensor = hwMap.get(DigitalChannel.class,"Touch_sensor");
//        touchSensor.setMode(DigitalChannel.Mode.INPUT);
//
//    }

    public boolean getTouchSensorState(){
        return touchSensor.getState();
    }

}
