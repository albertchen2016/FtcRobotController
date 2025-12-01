package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp
public class IfElseOpMode extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {
       if(gamepad1.left_stick_y<0){
           telemetry.addData("left stick y","is negative");
       }
       else{
           telemetry.addData("left stick y","is positive");
       }
       telemetry.addData("left stick y",gamepad1.left_stick_y);
    }
}
