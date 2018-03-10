package org.usfirst.frc5858.CompetitionBot.subsystems;

import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Communication with the NeoPixel LED board (Oreo Board)
 */
public class LEDDriver extends Subsystem {
	
	/**
	 * These are all the things the LED board can do
	 */
	public enum Commands {
		OFF,              // All LEDs OFF
		Test,             // Test sequence for all LEDs
		//
		ModeAutonomousRed,  // Entering autonomous mode on RED team
		ModeAutonomousBlue, // Entering autonomous mode on BLUE team
		ModeTeleop,         // Entering teleop mode
		//		
		PullIn,
		PushOut,
		PushPullStop,
		ArmUp,
		ArmDown,
		ArmStop,
		//
		LowGear,
		HighGear,
		//HalfPower,
		//FullPower,
		//TurnAround,
		//TurnAroundDone
		
	}
	
	// Connecting to the non-RS232-voltage port on
	// the MXP port.
	// MXP-UART-RX   pin 10
	// MXP_UART_DGND pin 12
	// MXP-UART-TX   pin 14
	private SerialPort port = new SerialPort(115_200,SerialPort.Port.kMXP);
	
	@Override
	protected void initDefaultCommand() {
		// Nothing to do
	}
	
	/**
	 * Send the desired LED command to the Oreo Board
	 * @param command what the LEDs do
	 */
	public void sendCommand2(Commands command) {
		// The OREO board uses carriage returns to separate commands
		port.writeString(command.toString()+"\r");
	}			

	/**
	 * Shortcut for the "Test" command
	 */
	public void test() {
		///sendCommand(Commands.Test);
	}	
	
	/**
	 * Shortcut for the "OFF" command
	 */
	public void allOff() {
		//sendCommand(Commands.OFF);
	}

}