
package org.usfirst.frc5858.CompetitionBot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
//import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc5858.CompetitionBot.commands.*;
import org.usfirst.frc5858.CompetitionBot.subsystems.*;

//import com.ctre.phoenix.sensors.PigeonIMU;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in 
 * the project.
 */
public class Robot extends TimedRobot {

    Command autonomousCommand;
    SendableChooser<Command> chooser = new SendableChooser<>();

    public static OI oi;

    public static Drivetrain drivetrain;
    public static Power_Cube_Cannon power_Cube_Cannon;
    public static Pull_up_Hook pull_up_Hook;
    public static PigeonBoard pigeonBoard;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    @Override
    public void robotInit() {
        RobotMap.init();
        drivetrain = new Drivetrain();
        power_Cube_Cannon = new Power_Cube_Cannon();
        pull_up_Hook = new Pull_up_Hook();
        pigeonBoard = new PigeonBoard();
       
        oi = new OI();
        
        String[] autonomousCommands = new String[3];
   	    autonomousCommands[0]  = "leftSwitch";
   	    autonomousCommands[1]  = "rightSwitch";
	    autonomousCommands[2]  = "driveStraight";
	    SmartDashboard.putStringArray("Auto List", autonomousCommands);
   	 
        chooser.addDefault("Autonomous Command", new AutonomousCommand());

        SmartDashboard.putData("Auto mode", chooser);
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    @Override
    public void disabledInit(){

    }

    @Override
    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void autonomousInit() {
        autonomousCommand = chooser.getSelected();
        // schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
        String autoModeSelected = SmartDashboard.getString("Auto Selector","");
    }

    /**
     * This function is called periodically during autonomous
     */
    @Override
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void teleopInit() {
        // This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
    }

    /**
     * This function is called periodically during operator control
     */
    @Override
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
}
