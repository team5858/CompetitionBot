package org.usfirst.frc5858.CompetitionBot.commands;

import org.usfirst.frc5858.CompetitionBot.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Auto_Block extends CommandGroup {

    public Auto_Block() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
    	//Dive Forward
    	addSequential(new Drivee_Timed(3) );
    	//it does drive up
    	addSequential(new Arm_Down() );
    	//it does put arm to down
    	addSequential(new Wait(2) );
    	//it does nothin'
    	addSequential(new Arm_Stop() );
    	//it make tha arm to stop
    	
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
