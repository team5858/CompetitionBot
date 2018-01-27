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
import com.ctre.phoenix.sensors.PigeonIMU;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class PigeonBoard extends Subsystem {
	
	public final PigeonIMU _pigeon = RobotMap.pigeonIMU;
	

    @Override
    public void initDefaultCommand() {
    
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop
    }

    
    public void getStatusIMU() {
    	//PigeonIMU.GeneralStatus genStatus = new PigeonIMU.GeneralStatus();
    	double [] ypr = new double[3];
    	_pigeon.getYawPitchRoll(ypr);
    	System.out.println("Yaw:" + ypr[0]);

    }
}

