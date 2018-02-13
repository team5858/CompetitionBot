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
	
    public OI() {
    	j1 = new Joystick(0);
    	a_button = new JoystickButton(j1, 1);
    	b_button = new JoystickButton(j1, 2);
    	x_button = new JoystickButton(j1, 3);
    	y_button = new JoystickButton(j1, 4);
    	
    	/*a_button.whenPressed(new Arm_To_Angle(30));
    	//a_button.whenReleased(new Arm_To_Angle(60));
    	x_button.whenPressed(new Arm_To_Angle(60));
    	b_button.whenPressed(new ZTEST_TalonSRXOff());
    	b_button.whenPressed(new Drive_Motors(0.2, 0.2));
    	b_button.whenReleased(new Stop());*/
    	
    	//a_button.whenPressed(new Pull_In());
    	//a_button.whenReleased(new Push_Pull_Stop());
    	//b_button.whenPressed(new Push_Out());
    	//b_button.whenReleased(new Push_Pull_Stop());
    	
    	a_button.whenPressed(new Push_Out());
    	a_button.whenReleased(new PushPull_Stop());
    	b_button.whenPressed(new Pull_In());
    	b_button.whenReleased(new PushPull_Stop());
    	x_button.whenPressed(new Spool_In());
    	x_button.whenReleased(new Spool_Stop());
    	y_button.whenPressed(new Spool_Out());
    	y_button.whenReleased(new Spool_Stop());
    	
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

