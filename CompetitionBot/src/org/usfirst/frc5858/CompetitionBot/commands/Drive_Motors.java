package org.usfirst.frc5858.CompetitionBot.commands;

import org.usfirst.frc5858.CompetitionBot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Drive_Motors extends Command {
	
	double left;
	double right;
	
    public Drive_Motors(double left, double right) {
    	this.left = left;
    	this.right = right;
        // Use requires() here to declare subsystem dependencies
        requires(Robot.drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.drivetrain.setSpeed(right, left);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
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
