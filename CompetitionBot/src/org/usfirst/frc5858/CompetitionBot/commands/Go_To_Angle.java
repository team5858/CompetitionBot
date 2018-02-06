package org.usfirst.frc5858.CompetitionBot.commands;

import org.usfirst.frc5858.CompetitionBot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Go_To_Angle extends Command {

    	double distance; 
    	double speed;
        public Go_To_Angle(double distance, double speed) {
        	requires(Robot.drivetrain);
        	this .distance = distance;
        	this .speed = speed; 
    }
    
		// TODO Auto-generated constructor stub
	

	// Called just before this Command runs the first time
    protected void initialize() {
    	Robot.drivetrain.robot_Drive_rd.arcadeDrive(0, speed);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	 double PACIFICRIM2 = Robot.drivetrain.getAngle();
         if (PACIFICRIM2 >= distance) {
         	Robot.drivetrain.robot_Drive_rd.arcadeDrive(0, 0);
         	return true;
         }
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
