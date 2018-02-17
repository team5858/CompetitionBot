package org.usfirst.frc5858.CompetitionBot.commands;

import org.usfirst.frc5858.CompetitionBot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Go_To_Angle extends Command {
	private double startAngle; 
	private double targetAngle;
	private double degrees; 
	private double speeds;
	
    public Go_To_Angle(double degrees, double speeds) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
	    requires(Robot.drivetrain);
	    this.degrees = degrees;
	    this.speeds = speeds;
    }


	// Called just before this Command runs the first time
    protected void initialize() {
    	startAngle = Robot.drivetrain.getGyroscope();
    	targetAngle = startAngle + degrees;
    	//Robot.drivetrain.robot_Drive_rd.arcadeDrive(0, speed);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (degrees > 0) {
    		Robot.drivetrain.robot_Drive_rd.arcadeDrive(0, speeds);  
    	}
    	else if (degrees < 0) {
    		Robot.drivetrain.robot_Drive_rd.arcadeDrive(0, -speeds);
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        
       double current = Robot.drivetrain.getGyroscope();
       if (degrees > 0) {
    	   if (current >= targetAngle) {
    		   return true;
    	   }
       }
       else if (degrees < 0) {
    	   if (current <= targetAngle) {
    		   return true;
    	   }
       }
       
       return false;
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
