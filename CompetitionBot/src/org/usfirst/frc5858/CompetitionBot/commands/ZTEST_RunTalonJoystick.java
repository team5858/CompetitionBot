package org.usfirst.frc5858.CompetitionBot.commands;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import org.usfirst.frc5858.CompetitionBot.Robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class ZTEST_RunTalonJoystick extends Command {

    public ZTEST_RunTalonJoystick() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drivetrain);
    	this.setInterruptible(true);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Joystick j1 = new Joystick(0);
    	double power = j1.getY();
    	
    	power *= 4096 * 500.0 / 600;
    	Robot.drivetrain.runTalonVelocity(power);
    	
    	double volts = Robot.drivetrain.left_Speed_Controller.getMotorOutputVoltage();
    	//String voltsTwoPlaces = String.format("%.2f", volts);
    	NumberFormat formatter = new DecimalFormat("#0.00");
    	String voltsTwoPlaces = formatter.format(volts);
    	SmartDashboard.putString("DB/String 0", "Voltage: " + voltsTwoPlaces);
    	
    	double quadVel = Robot.drivetrain.left_Speed_Controller.getSelectedSensorVelocity(0);
    	String quadVelTwoPlaces = String.format("%.2f", quadVel);
    	SmartDashboard.putString("DB/String 1", "Velocity: " + quadVelTwoPlaces);
    	
    	String y = formatter.format(power);
    	SmartDashboard.putString("DB/String 2", y);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
