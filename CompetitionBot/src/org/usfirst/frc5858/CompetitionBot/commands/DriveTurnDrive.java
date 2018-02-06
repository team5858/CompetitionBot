package org.usfirst.frc5858.CompetitionBot.commands;

import org.usfirst.frc5858.CompetitionBot.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class DriveTurnDrive extends CommandGroup {

    public DriveTurnDrive(double firstdistance, double angle, double seconddistance) {
    	requires(Robot.drivetrain);
        addSequential (new Go_To_Distance(firstdistance,0.5));
        addSequential (new Go_To_Angle(angle, 0.5));
        addSequential (new Go_To_Distance(seconddistance,0.2));
        
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
