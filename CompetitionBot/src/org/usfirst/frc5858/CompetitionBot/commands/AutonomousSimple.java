package org.usfirst.frc5858.CompetitionBot.commands;

import org.usfirst.frc5858.CompetitionBot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutonomousSimple extends Command {
    public static final double DISTANCETOGO = 1;

    public AutonomousSimple() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	//start the motor
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//drive forward x distance
    	Robot.drivetrain.robot_Drive_rd.arcadeDrive(.5, 0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	double PACIFICRIM = Robot.drivetrain.getDigitalRange();
    	return PACIFICRIM > DISTANCETOGO;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
