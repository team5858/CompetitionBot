package org.usfirst.frc5858.CompetitionBot;

import org.usfirst.frc5858.CompetitionBot.commands.*;

//import com.ctre.phoenix.sensors.PigeonIMU;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    
	Joystick j1;
	Button a_button;
	Button b_button;
	Button x_button;
	Button y_button;
	Button lb_button;
	Button rb_button;
	Button lt_button;
	Button rt_button;
	
    public OI() {
    	j1 = new Joystick(0);
    	x_button = new JoystickButton(j1, 1); //?
    	a_button = new JoystickButton(j1, 2); //Arm Down
    	b_button = new JoystickButton(j1, 3); //180
    	y_button = new JoystickButton(j1, 4); //Arm Up
    	lb_button = new JoystickButton(j1, 5); // pull in
    	rb_button = new JoystickButton(j1, 6); // push out
    	lt_button = new JoystickButton(j1, 7); // hold for low
    	rt_button = new JoystickButton(j1, 8); // hold for 50%
    	
    	a_button.whenPressed(new Arm_Down());
    	a_button.whenPressed(new Arm_Stop());
    	
        y_button.whenPressed(new Arm_Up());
        y_button.whenReleased(new Arm_Stop());
        
        lb_button.whenPressed(new Pull_In());
        lb_button.whenReleased(new Push_Pull_Stop());
        
        rb_button.whenPressed(new Push_Out());
        rb_button.whenReleased(new Push_Pull_Stop());
        
    	lt_button.whenPressed(new Low_Gear());
    	lt_button.whenReleased(new High_Gear());
    	
    	rt_button.whenPressed(new Half_Power());
    	rt_button.whenReleased(new Full_Power());
    	
    	b_button.whenPressed(new Turn_Around());
    	
        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("Pull_In", new Pull_In());
        SmartDashboard.putData("Push_Out", new Push_Out());
        SmartDashboard.putData("Arm_Up", new Arm_Up());
        SmartDashboard.putData("Arm_Down", new Arm_Down());
        //SmartDashboard.putData("Drive", new Drive());
        SmartDashboard.putData("Spool_In", new Spool_In());
        SmartDashboard.putData("Spool_Out", new Spool_Out());
        SmartDashboard.putData("Hook_Up", new Hook_Up());
        SmartDashboard.putData("Hook_Down", new Hook_Down());
        
    }

}

