package org.usfirst.frc5858.CompetitionBot.commands;

import org.usfirst.frc5858.CompetitionBot.Robot;

import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *
 */
public class Drivee_Timed extends TimedCommand {

    public Drivee_Timed(double timeout) {
        super(timeout);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(Robot.drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	//Robot.drivetrain.robot_Drive_rd.arcadeDrive(.5, 0);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//double yaw = Robot.drivetrain.getGyroscope();
    	Robot.drivetrain.robot_Drive_rd.arcadeDrive(-.5, 0);
    }

    // Called once after timeout
    protected void end() {
    	Robot.drivetrain.robot_Drive_rd.arcadeDrive(0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
