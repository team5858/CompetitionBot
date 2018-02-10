
package org.usfirst.frc5858.CompetitionBot;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.sensors.PigeonIMU;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.VictorSP;
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
    
    public static VictorSPX power_Cube_CannonLeft_Manipulator_1;
    public static VictorSPX power_Cube_CannonLeft_Manipulator_2;
    public static VictorSPX power_Cube_CannonRight_Manipulator_1;
    public static VictorSPX power_Cube_CannonRight_Manipulator_2;
    public static TalonSRX power_Cube_Shoulder;
    public static VictorSPX power_Cube_CannonRight_Shoulder;

    public static SpeedController pull_up_HookSpool;
    public static SpeedController pull_up_HookSecond_Stage_Left;
    public static SpeedController pull_up_HookSecond_Stage_Right;
    public static AnalogInput ultrasonic;
    public static Ultrasonic digitalsonic;
    
    public static PigeonIMU pigeonIMU;
    public static Potentiometer pot;
   
    // CAN IDs
    private static final int driveLeft1_CID = 2;
    private static final int driveLeft2_CID = 3;
    private static final int driveLeft3_CID = 4;
    
    private static final int driveRight1_CID = 5;
    private static final int driveRight2_CID = 6;
    private static final int driveRight3_CID = 7;
    
    private static final int powerCubeCannonLeft1_CID    = 9; //8;
    private static final int powerCubeCannonLeft2_CID    = 10; //9;
    private static final int powerCubeCannonRight1_CID   = 11; //10;
    private static final int powerCubeCannonRight2_CID   = 12; //11;
    private static final int actuator1_CID = 8;
    private static final int pigeon_IMU_CID = 13;
    
    //pwm ids
    private static final int climberStageTwo1_PWMID = 0;
    private static final int climberStageTwo2_PWMID = 1;
    private static final int climberStageOne1_PWMID = 2;
    
    // ANALOG IDs
    private static final int ultrasonic_AID = 0;
    private static final int potentiometer_AID = 1;
    
    public static void init() {
                        
        final int timeoutMs = 10;
        final int loopIdx = 0;
        //final int slotIdx = 0;
        
        drivetrainLeft_Speed_Controller1 = new WPI_TalonSRX(driveLeft1_CID);        
        drivetrainLeft_Speed_Controller1.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 0);
        drivetrainLeft_Speed_Controller1.setSensorPhase(true); 
        drivetrainLeft_Speed_Controller1.configNominalOutputForward(0, timeoutMs);
        drivetrainLeft_Speed_Controller1.configNominalOutputReverse(0, timeoutMs);
        drivetrainLeft_Speed_Controller1.configPeakOutputForward(1, timeoutMs);
        drivetrainLeft_Speed_Controller1.configPeakOutputReverse(-1, timeoutMs);
        drivetrainLeft_Speed_Controller1.config_kF(loopIdx, 0.1097, timeoutMs);
        drivetrainLeft_Speed_Controller1.config_kP(loopIdx, 0.113333, timeoutMs);
        drivetrainLeft_Speed_Controller1.config_kI(loopIdx, 0, timeoutMs);
        drivetrainLeft_Speed_Controller1.config_kD(loopIdx, 0, timeoutMs);        
        drivetrainLeft_Speed_Controller1.setInverted(false);
        
        drivetrainLeft_Speed_Controller2 = new WPI_TalonSRX(driveLeft2_CID);
        drivetrainLeft_Speed_Controller2.follow(drivetrainLeft_Speed_Controller1);
        
        drivetrainLeft_Speed_Controller3 = new WPI_TalonSRX(driveLeft3_CID);
        drivetrainLeft_Speed_Controller3.follow(drivetrainLeft_Speed_Controller1);

        drivetrainRight_Speed_Controller1 = new WPI_TalonSRX(driveRight1_CID);        
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
        
        drivetrainRight_Speed_Controller2 = new WPI_TalonSRX(driveRight2_CID);
        drivetrainRight_Speed_Controller2.follow(drivetrainRight_Speed_Controller1);
        
        drivetrainRight_Speed_Controller3 = new WPI_TalonSRX(driveRight3_CID);
        drivetrainRight_Speed_Controller3.follow(drivetrainRight_Speed_Controller1);  
        
        // ROBOT DRIVE
        drivetrainRobot_Drive_rd = new DifferentialDrive(drivetrainLeft_Speed_Controller1, drivetrainRight_Speed_Controller1);             
        drivetrainRobot_Drive_rd.setExpiration(0.1);
        drivetrainRobot_Drive_rd.setMaxOutput(1.0);
        
        
        // POWER CUBE CANNON
        power_Cube_CannonLeft_Manipulator_1 = new VictorSPX(powerCubeCannonLeft1_CID);
        power_Cube_CannonLeft_Manipulator_1.setInverted(false);
        
        power_Cube_CannonLeft_Manipulator_2 = new VictorSPX(powerCubeCannonLeft2_CID);
        power_Cube_CannonLeft_Manipulator_2.setInverted(false);
        
        power_Cube_CannonRight_Manipulator_1 = new VictorSPX(powerCubeCannonRight1_CID);
        power_Cube_CannonRight_Manipulator_1.setInverted(false);
        
        power_Cube_CannonRight_Manipulator_2 = new VictorSPX(powerCubeCannonRight2_CID);
        power_Cube_CannonRight_Manipulator_2.setInverted(false);
        
        //power_Cube_Shoulder = new TalonSRX(powerCubeCannonShoulder_ID);
        power_Cube_Shoulder = new TalonSRX(actuator1_CID);
        power_Cube_Shoulder.setInverted(false);
        
        power_Cube_CannonLeft_Manipulator_2.follow(power_Cube_CannonLeft_Manipulator_1);
        power_Cube_CannonRight_Manipulator_1.follow(power_Cube_CannonLeft_Manipulator_1);
        power_Cube_CannonRight_Manipulator_2.follow(power_Cube_CannonLeft_Manipulator_1);
        
        
        // PULL UP HOOK
        pull_up_HookSpool = new VictorSP(climberStageTwo1_PWMID);
        pull_up_HookSpool.setInverted(false);
        pull_up_HookSecond_Stage_Left = new VictorSP(climberStageTwo2_PWMID);
        pull_up_HookSecond_Stage_Left.setInverted(false);
        pull_up_HookSecond_Stage_Right = new VictorSP(climberStageOne1_PWMID);
        pull_up_HookSecond_Stage_Right.setInverted(false);

    	pot = new AnalogPotentiometer(potentiometer_AID, 90, 0);
                
    	// SENSORS
        //pot = new AnalogPotentiometer(ultrasonic_ID, 360, 0);
    	pigeonIMU = new PigeonIMU(pigeon_IMU_CID);
    	
        ultrasonic = new AnalogInput(ultrasonic_AID);
        
		AnalogInput.setGlobalSampleRate(10000);
    }
}
