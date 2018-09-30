
package org.usfirst.frc.team5987.robot.subsystems;

import org.usfirst.frc.team5987.robot.RobotMap;
import org.usfirst.frc.team5987.robot.commands.JoystickCommand;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;


/**
 *
 */
public class driveSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	Victor MotorRightBack = new Victor(RobotMap.driveRightRearMotor);
	Victor MotorRightFront = new Victor(RobotMap.driveRightFrontMotor);
	Victor MotorLeftBack = new Victor(RobotMap.driveLeftRearMotor);
	Victor MotorLeftFront = new Victor(RobotMap.driveLeftFrontMotor);
	Encoder EncoderLeft = new Encoder(RobotMap.driveLeftEncoderChannelA, RobotMap.driveLeftEncoderChannelB);
	Encoder EncoderRight = new Encoder(RobotMap.driveRightEncoderChannelA, RobotMap.driveRightEncoderChannelB);
	
	// Creates a new NetworkTable
	public NetworkTable driveTable = NetworkTableInstance.getDefault().getTable("driveTable");

	public NetworkTableEntry driveSpeedInAuto = driveTable.getEntry("driveSpeedInAuto");
	
	public driveSubsystem(){
		EncoderLeft.setDistancePerPulse(RobotMap.driveEncoderDistancePerPulse);
		EncoderRight.setDistancePerPulse(RobotMap.driveEncoderDistancePerPulse);
		MotorLeftBack.setInverted(false);
    	MotorLeftFront.setInverted(false);
    	MotorRightBack.setInverted(true);
    	MotorRightFront.setInverted(true);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new JoystickCommand());
    }
    
    public void setSpeed(double LeftSpeed,double RightSpeed) {
    	
    	setLeftSpeed(LeftSpeed);
    	setRightSpeed(RightSpeed);
    	
    }
    
    public void setLeftSpeed(double speed) {
    	
    	MotorLeftBack.set(speed);
    	MotorLeftFront.set(speed);
    	
    }
    
    public void setRightSpeed(double speed) {
    	
    	MotorRightBack.set(speed);
    	MotorRightFront.set(speed);
    	
    }
    
    public double getDistance() {
    	
    	return ((getLeftDistance() + ( getRightDistance()))/2);
    	
    }
    
    public double getLeftDistance() {
    	
    	return EncoderLeft.getDistance();
    	
    }

    public double getRightDistance() {
	
    	return -EncoderRight.getDistance();
	
}
}

