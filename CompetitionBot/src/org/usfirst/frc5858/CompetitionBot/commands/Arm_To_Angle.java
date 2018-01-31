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
	boolean finished;
	
    public Arm_To_Angle(double angle) {
    	this.angle = angle;
    	requires(Robot.power_Cube_Cannon);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	if(angle < 30.0 || angle > 60.0) {
    		finished = true;
    	}
    	else {
    		finished = false;	
	        // Use requires() here to declare subsystem dependencies
	        
	        
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
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
//leg so hot hot hot leg leg so hot you fry an egg - Erin
    	current = Robot.power_Cube_Cannon.potentiometer();
    	if(!isUp) {
        	if(current <= angle) {
        		Robot.power_Cube_Cannon.armStop();
        		finished = true;
        	}
        }
        else {
        	if(current >= angle) {
        		Robot.power_Cube_Cannon.armStop();
        		finished = true;
        	}
        }
    } 

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return finished;
      /*  
    	
    	return false; */
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
