package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class UseRobotLocationOpMode extends OpMode {
    RobotLocationRadians robotLocationRadians = new RobotLocationRadians(0);

    @Override
    public void init() {
        robotLocationRadians.setAngle(0);

    }

    @Override
    public void loop() {
        if(gamepad1.a){
            robotLocationRadians.turn(0.1);
        }
        else if(gamepad1.b){
            robotLocationRadians.turn(-0.1);
        }

        telemetry.addData("Location",robotLocationRadians);
        telemetry.addData("Heading",robotLocationRadians.getHeading());

    }
}
