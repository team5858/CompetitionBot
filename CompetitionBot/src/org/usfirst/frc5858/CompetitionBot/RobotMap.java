
package org.usfirst.frc5858.CompetitionBot;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.sensors.PigeonIMU;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.interfaces.Potentiometer;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {  
	// Drivetrain motor controllers
    public static WPI_TalonSRX drivetrainLeft_Speed_Controller1;
    public static WPI_TalonSRX drivetrainRight_Speed_Controller1;
    
    public static WPI_TalonSRX drivetrainLeft_Speed_Controller2;
    public static WPI_TalonSRX drivetrainRight_Speed_Controller2;
    
    public static WPI_TalonSRX drivetrainLeft_Speed_Controller3; 
    public static WPI_TalonSRX drivetrainRight_Speed_Controller3; 
    public static DifferentialDrive drivetrainRobot_Drive_rd;
    
    public static TalonSRX power_Cube_CannonLeft_Manipulator_1;
    public static TalonSRX power_Cube_CannonLeft_Manipulator_2;
    public static TalonSRX power_Cube_CannonRight_Manipulator_1;
    public static TalonSRX power_Cube_CannonRight_Manipulator_2;
    public static TalonSRX power_Cube_Shoulder;
    public static TalonSRX power_Cube_CannonRight_Shoulder;

    public static SpeedController pull_up_HookSpool;
    public static SpeedController pull_up_HookSecond_Stage_Left;
    public static SpeedController pull_up_HookSecond_Stage_Right;
    public static AnalogInput ultrasonic;
    public static Ultrasonic digitalsonic;
    
    public static PigeonIMU pigeonIMU;
    public static Potentiometer pot;
    
    // CAN IDs
    //private static final int driveLeft1_ID = 9; //2;
    private static final int driveLeft2_ID = 10; //3;
    private static final int driveLeft3_ID = 11; //4;
    
    private static final int driveRight1_ID = 5;
    private static final int driveRight2_ID = 6;
    private static final int driveRight3_ID = 7;
    
    private static final int powerCubeCannonLeft1_ID    = 2; //8;
    private static final int powerCubeCannonLeft2_ID    = 3; //9;
    private static final int powerCubeCannonRight1_ID   = 4; //10;
    private static final int powerCubeCannonRight2_ID   = 8; //11;
    
    //private static final int powerCubeCannonShoulder_ID = 12;
    
    private static final int pigeon_IMU_ID = 13;
    
    // ANALOG IDs
    private static final int ultrasonic_ID = 0;
    //private static final int potentiometer_ID = 1;
    
    public static void init() {
                        
        final int timeoutMs = 10;
        final int loopIdx = 0;
        //final int slotIdx = 0;
    	
        drivetrainLeft_Speed_Controller1 = new WPI_TalonSRX(25);
        //drivetrainLeft_Speed_Controller1 = new WPI_TalonSRX(driveLeft1_ID);
        
        drivetrainLeft_Speed_Controller1.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 0);
        drivetrainLeft_Speed_Controller1.setSensorPhase(true);
        
        drivetrainLeft_Speed_Controller1.configNominalOutputForward(0, timeoutMs);
        drivetrainLeft_Speed_Controller1.configNominalOutputReverse(0, timeoutMs);
        drivetrainLeft_Speed_Controller1.configPeakOutputForward(1, timeoutMs);
        drivetrainLeft_Speed_Controller1.configPeakOutputReverse(-1, timeoutMs);

		/* set closed loop gains in slot0 */
        drivetrainLeft_Speed_Controller1.config_kF(loopIdx, 0.1097, timeoutMs);
        drivetrainLeft_Speed_Controller1.config_kP(loopIdx, 0.113333, timeoutMs);
        drivetrainLeft_Speed_Controller1.config_kI(loopIdx, 0, timeoutMs);
        drivetrainLeft_Speed_Controller1.config_kD(loopIdx, 0, timeoutMs);
        
        //LiveWindow.addActuator("Drivetrain", "Left_Speed_Controller", (TalonSRX) drivetrainLeft_Speed_Controller);
        drivetrainLeft_Speed_Controller1.setInverted(false);
        
        drivetrainLeft_Speed_Controller2 = new WPI_TalonSRX(driveLeft2_ID);
        drivetrainLeft_Speed_Controller2.follow(drivetrainLeft_Speed_Controller1);
        
        drivetrainLeft_Speed_Controller3 = new WPI_TalonSRX(driveLeft3_ID);
        drivetrainLeft_Speed_Controller3.follow(drivetrainLeft_Speed_Controller1);
        

        drivetrainRight_Speed_Controller1 = new WPI_TalonSRX(driveRight1_ID);
        
        drivetrainRight_Speed_Controller1.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 0);
        drivetrainRight_Speed_Controller1.setSensorPhase(true);
        drivetrainRight_Speed_Controller1.configNominalOutputForward(0, timeoutMs);
        drivetrainRight_Speed_Controller1.configNominalOutputReverse(0, timeoutMs);
        drivetrainRight_Speed_Controller1.configPeakOutputForward(1, timeoutMs);
        drivetrainRight_Speed_Controller1.configPeakOutputReverse(-1, timeoutMs);
        drivetrainRight_Speed_Controller1.config_kF(loopIdx, 0.1097, timeoutMs);
        drivetrainRight_Speed_Controller1.config_kP(loopIdx, 0.113333, timeoutMs);
        drivetrainRight_Speed_Controller1.config_kI(loopIdx, 0, timeoutMs);
        drivetrainRight_Speed_Controller1.config_kD(loopIdx, 0, timeoutMs);
        drivetrainRight_Speed_Controller1.setInverted(false);
        
        drivetrainRight_Speed_Controller2 = new WPI_TalonSRX(driveRight2_ID);
        drivetrainRight_Speed_Controller2.follow(drivetrainRight_Speed_Controller1);
        
        drivetrainRight_Speed_Controller3 = new WPI_TalonSRX(driveRight3_ID);
        drivetrainRight_Speed_Controller3.follow(drivetrainRight_Speed_Controller1);  
        
        // ROBOT DRIVE
        drivetrainRobot_Drive_rd = new DifferentialDrive(drivetrainLeft_Speed_Controller1, drivetrainRight_Speed_Controller1);             
        drivetrainRobot_Drive_rd.setExpiration(0.1);
        drivetrainRobot_Drive_rd.setMaxOutput(1.0);
        
        
        // POWER CUBE CANNON
        power_Cube_CannonLeft_Manipulator_1 = new TalonSRX(powerCubeCannonLeft1_ID);
        power_Cube_CannonLeft_Manipulator_1.setInverted(false);
        
        power_Cube_CannonLeft_Manipulator_2 = new TalonSRX(powerCubeCannonLeft2_ID);
        power_Cube_CannonLeft_Manipulator_2.setInverted(false);
        
        power_Cube_CannonRight_Manipulator_1 = new TalonSRX(powerCubeCannonRight1_ID);
        power_Cube_CannonRight_Manipulator_1.setInverted(false);
        
        power_Cube_CannonRight_Manipulator_2 = new TalonSRX(powerCubeCannonRight2_ID);
        power_Cube_CannonRight_Manipulator_2.setInverted(false);
        
        //power_Cube_Shoulder = new TalonSRX(powerCubeCannonShoulder_ID);
        power_Cube_Shoulder = new TalonSRX(2);
        power_Cube_Shoulder.setInverted(false);
        
        power_Cube_CannonLeft_Manipulator_2.follow(power_Cube_CannonLeft_Manipulator_1);
        power_Cube_CannonRight_Manipulator_1.follow(power_Cube_CannonLeft_Manipulator_1);
        power_Cube_CannonRight_Manipulator_2.follow(power_Cube_CannonLeft_Manipulator_1);
        
        
        // PULL UP HOOK
        pull_up_HookSpool = new Spark(8);
        pull_up_HookSpool.setInverted(false);
        pull_up_HookSecond_Stage_Left = new Spark(9);
        pull_up_HookSecond_Stage_Left.setInverted(false);
        pull_up_HookSecond_Stage_Right = new Spark(10);
        pull_up_HookSecond_Stage_Right.setInverted(false);

    	pot = new AnalogPotentiometer(3, 90, 0);
                
    	// SENSORS
        //pot = new AnalogPotentiometer(ultrasonic_ID, 360, 0);
    	pigeonIMU = new PigeonIMU(pigeon_IMU_ID);
    	
        ultrasonic = new AnalogInput(ultrasonic_ID);
        
        digitalsonic = new Ultrasonic(1,2);
        
		AnalogInput.setGlobalSampleRate(10000);
    }
}
