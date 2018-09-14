package org.usfirst.frc.team5987.robot.subsystems;

import org.usfirst.frc.team5987.robot.RobotMap;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class intakeSubsystem extends Subsystem {
	
	Victor intakeLeft = new Victor (RobotMap.intakeMotorLeft);
    Victor intakeRight = new Victor (RobotMap.intakeMotorRight);
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    public intakeSubsystem(){
    	
    	intakeLeft.setInverted(false);
    	intakeRight.setInverted(true);
    	
    }
    
    public void setSpeed(double speed){
    	
    	intakeLeft.set(speed);
    	intakeRight.set(speed);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

