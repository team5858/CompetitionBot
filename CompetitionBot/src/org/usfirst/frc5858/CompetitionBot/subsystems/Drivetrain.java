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
public class Drivetrain extends Subsystem {

	public final TalonSRX left_Speed_Controller = RobotMap.drivetrainLeft_Speed_Controller1;
    private final TalonSRX right_Speed_Controller = RobotMap.drivetrainRight_Speed_Controller1;
    private final DifferentialDrive robot_Drive_rd = RobotMap.drivetrainRobot_Drive_rd;
   
    public void setSpeed (double right, double left) {
		left_Speed_Controller.set(ControlMode.PercentOutput, left);
		right_Speed_Controller.set(ControlMode.PercentOutput, right);
    }
    public void gofoward (double distanceFeet) {
    	
    }
    public void spin (double angleDegrees) {
    	
    }
    @Override
    public void initDefaultCommand() {
    	setDefaultCommand(new ZTEST_RunTalonJoystick());
    }
    
    @Override
    public void periodic()
    {
    	
    }

    /*
    @Override
    public void periodic() {
        // Put code here to be run every loop
    	SmartDashboard.putNumber("Encoder Velocity", RobotMap.drivetrainLeft_Speed_Controller1.getSelectedSensorVelocity(0));
    	SmartDashboard.putNumber("Encoder Position", RobotMap.drivetrainLeft_Speed_Controller1.getSelectedSensorPosition(0));
        
    }*/

    public void RunTalon()
    {
    	left_Speed_Controller.set(ControlMode.PercentOutput, 0.1);
    }
    
    public void StopTalon()
    {
    	left_Speed_Controller.set(ControlMode.PercentOutput, 0.0);
    }
    
    public void SetPower(double power)
    {
    	left_Speed_Controller.set(ControlMode.PercentOutput, power);
    }
    
    public void runTalonVelocity(double velocity)
    {
    	left_Speed_Controller.set(ControlMode.Velocity, velocity);
    }
    public void runTalonPosition(double distance/*ft*/)
    {
    	final double SCALE_FACTOR = 4096;
    	
    	left_Speed_Controller.set(ControlMode.Position, distance * SCALE_FACTOR);
    }
}


