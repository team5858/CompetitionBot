package org.usfirst.frc5858.CompetitionBot.commands;

import org.usfirst.frc5858.CompetitionBot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Arm_To_Angle extends Command {
	
	double angle;
	boolean isUp;
	double current;
    public Arm_To_Angle(double angle) {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.power_Cube_Cannon);
        this.angle = angle;
        current = Robot.power_Cube_Cannon.potentiometer();
        if(current < angle) {
        	isUp = true;
        	Robot.power_Cube_Cannon.armUp();
        }
        else {
        	isUp = false;
        	Robot.power_Cube_Cannon.armDown();
        }
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
//leg so hot hot hot leg leg so hot you fry an egg - Erin
    	current = Robot.power_Cube_Cannon.potentiometer();
    } 

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        if(isUp) {
        	if(current <= angle) {
        		Robot.power_Cube_Cannon.armStop();
        		return true;
        	}
        }
        else {
        	if(current >= angle) {
        		Robot.power_Cube_Cannon.armStop();
        		return true;
        	}
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
