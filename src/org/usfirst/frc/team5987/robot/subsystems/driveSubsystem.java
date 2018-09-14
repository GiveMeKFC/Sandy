
package org.usfirst.frc.team5987.robot.subsystems;

import org.usfirst.frc.team5987.robot.RobotMap;
import org.usfirst.frc.team5987.robot.commands.JoystickCommand;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

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
	
	public driveSubsystem(){
		
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
    	
    	MotorLeftBack.set(LeftSpeed);
    	MotorLeftFront.set(LeftSpeed);
    	MotorRightBack.set(RightSpeed);
    	MotorRightFront.set(RightSpeed);
    	
    }
}

