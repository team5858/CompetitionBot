package org.usfirst.frc5858.CompetitionBot.commands;

import org.usfirst.frc5858.CompetitionBot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Go_To_Ultrasonic_Distance extends Command {
	private double Ultrasonic_Distance;
    public Go_To_Ultrasonic_Distance(double distance) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drivetrain);
    	Ultrasonic_Distance = distance;
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.drivetrain.robot_Drive_rd.arcadeDrive(1,0);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	double current = Robot.drivetrain.getUltraRange();
        if (current < Ultrasonic_Distance) {
        	return true;
        }
        else if (current > Ultrasonic_Distance) {
        	return false;
        }
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drivetrain.robot_Drive_rd.stopMotor();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
