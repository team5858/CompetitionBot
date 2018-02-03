package org.usfirst.frc5858.CompetitionBot.commands;

import org.usfirst.frc5858.CompetitionBot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Drivee_Straight extends Command {

	double power;
	
    public Drivee_Straight(double power) {
        // Use requires() here to declare subsystem dependencies
       requires(Robot.drivetrain);
       
       this.power = power;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.drivetrain.robot_Drive_rd.arcadeDrive(power, 0);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double yaw = Robot.drivetrain.getGyroscope();
    	Robot.drivetrain.robot_Drive_rd.arcadeDrive(power, -yaw * 0.03);
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
