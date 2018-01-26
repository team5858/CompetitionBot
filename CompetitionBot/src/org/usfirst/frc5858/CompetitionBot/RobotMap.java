// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5858.CompetitionBot;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static TalonSRX drivetrainLeft_Speed_Controller;
    public static SpeedController drivetrainRight_Speed_Controller;
    //public static RobotDrive drivetrainRobot_Drive_rd;
    public static TalonSRX power_Cube_CannonLeft_Manipulator_1;
    public static TalonSRX power_Cube_CannonLeft_Manipulator_2;
    public static TalonSRX power_Cube_CannonRight_Manipulator_1;
    public static TalonSRX power_Cube_CannonRight_Manipulator_2;
    public static TalonSRX power_Cube_CannonLeft_Shoulder;
    public static TalonSRX power_Cube_CannonRight_Shoulder;
    public static SpeedController pull_up_HookSpool;
    public static SpeedController pull_up_HookSecond_Stage_Left;
    public static SpeedController pull_up_HookSecond_Stage_Right;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        drivetrainLeft_Speed_Controller = new TalonSRX(1);
        drivetrainLeft_Speed_Controller.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 0);
        drivetrainLeft_Speed_Controller.setSensorPhase(false);
        
        final int timeoutMs = 10;
        final int loopIdx = 0;
        final int slotIdx = 0;
        
        drivetrainLeft_Speed_Controller.configNominalOutputForward(0, timeoutMs);
        drivetrainLeft_Speed_Controller.configNominalOutputReverse(0, timeoutMs);
        drivetrainLeft_Speed_Controller.configPeakOutputForward(1, timeoutMs);
        drivetrainLeft_Speed_Controller.configPeakOutputReverse(-1, timeoutMs);

		/* set closed loop gains in slot0 */
        drivetrainLeft_Speed_Controller.config_kF(loopIdx, 0.1097, timeoutMs);
        drivetrainLeft_Speed_Controller.config_kP(loopIdx, 0.113333, timeoutMs);
        drivetrainLeft_Speed_Controller.config_kI(loopIdx, 0, timeoutMs);
        drivetrainLeft_Speed_Controller.config_kD(loopIdx, 0, timeoutMs);
        
        
        //LiveWindow.addActuator("Drivetrain", "Left_Speed_Controller", (TalonSRX) drivetrainLeft_Speed_Controller);
        drivetrainLeft_Speed_Controller.setInverted(false);
        drivetrainRight_Speed_Controller = new Talon(1);
        LiveWindow.addActuator("Drivetrain", "Right_Speed_Controller", (Talon) drivetrainRight_Speed_Controller);
        drivetrainRight_Speed_Controller.setInverted(false);
        
        /*
        drivetrainRobot_Drive_rd = new RobotDrive((SpeedController) drivetrainLeft_Speed_Controller, drivetrainRight_Speed_Controller);
        
        drivetrainRobot_Drive_rd.setSafetyEnabled(true);
        drivetrainRobot_Drive_rd.setExpiration(0.1);
        drivetrainRobot_Drive_rd.setSensitivity(0.5);
        drivetrainRobot_Drive_rd.setMaxOutput(1.0);
        
        */

        power_Cube_CannonLeft_Manipulator_1 = new TalonSRX(2);
        power_Cube_CannonLeft_Manipulator_1.setInverted(false);
        power_Cube_CannonLeft_Manipulator_2 = new TalonSRX(3);
        power_Cube_CannonLeft_Manipulator_2.setInverted(false);
        power_Cube_CannonRight_Manipulator_1 = new TalonSRX(4);
        power_Cube_CannonRight_Manipulator_1.setInverted(false);
        power_Cube_CannonRight_Manipulator_2 = new TalonSRX(5);
        power_Cube_CannonRight_Manipulator_2.setInverted(false);
        power_Cube_CannonLeft_Shoulder = new TalonSRX(6);
        power_Cube_CannonLeft_Shoulder.setInverted(false);
        power_Cube_CannonRight_Shoulder = new TalonSRX(7);
        power_Cube_CannonRight_Shoulder.setInverted(false);
        
        power_Cube_CannonLeft_Manipulator_2.follow(power_Cube_CannonLeft_Manipulator_1);
        power_Cube_CannonRight_Manipulator_1.follow(power_Cube_CannonLeft_Manipulator_1);
        power_Cube_CannonRight_Manipulator_2.follow(power_Cube_CannonLeft_Manipulator_1);
        
        pull_up_HookSpool = new Spark(8);
        LiveWindow.addActuator("Pull_up_Hook", "Spool", (Spark) pull_up_HookSpool);
        pull_up_HookSpool.setInverted(false);
        pull_up_HookSecond_Stage_Left = new Spark(9);
        LiveWindow.addActuator("Pull_up_Hook", "Second_Stage_Left", (Spark) pull_up_HookSecond_Stage_Left);
        pull_up_HookSecond_Stage_Left.setInverted(false);
        pull_up_HookSecond_Stage_Right = new Spark(10);
        LiveWindow.addActuator("Pull_up_Hook", "Second_Stage_Right", (Spark) pull_up_HookSecond_Stage_Right);
        pull_up_HookSecond_Stage_Right.setInverted(false);

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
