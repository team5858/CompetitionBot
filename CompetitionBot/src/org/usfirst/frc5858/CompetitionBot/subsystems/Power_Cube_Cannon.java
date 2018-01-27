// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5858.CompetitionBot.subsystems;

import org.usfirst.frc5858.CompetitionBot.RobotMap;
import org.usfirst.frc5858.CompetitionBot.commands.*;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class Power_Cube_Cannon extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final TalonSRX left_Manipulator_1 = RobotMap.power_Cube_CannonLeft_Manipulator_1;
    private final TalonSRX left_Manipulator_2 = RobotMap.power_Cube_CannonLeft_Manipulator_2;
    private final TalonSRX right_Manipulator_1 = RobotMap.power_Cube_CannonRight_Manipulator_1;
    private final TalonSRX right_Manipulator_2 = RobotMap.power_Cube_CannonRight_Manipulator_2;
    private final TalonSRX left_Shoulder = RobotMap.power_Cube_CannonLeft_Shoulder;
    private final TalonSRX right_Shoulder = RobotMap.power_Cube_CannonRight_Shoulder;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        left_Manipulator_1.set(ControlMode.PercentOutput, 0.0);
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }
    
    public void pullIn() {
//left_Manipulator_1.set(ControlMode.Velocity, );
  
    }
}

