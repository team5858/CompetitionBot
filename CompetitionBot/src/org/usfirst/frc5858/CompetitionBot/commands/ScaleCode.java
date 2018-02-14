package org.usfirst.frc5858.CompetitionBot.commands;

import org.usfirst.frc5858.CompetitionBot.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class ScaleCode extends CommandGroup {

    public ScaleCode() {
    	requires (Robot.drivetrain);
    	requires (Robot.power_Cube_Cannon);
    	requires (Robot.pull_up_Hook);
    	addSequential (new DriveTurnDrive (10.0, 90.0, 10.0));
    	addSequential (new Arm_Up()); 
    	addSequential (new Hook_Up());

        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
