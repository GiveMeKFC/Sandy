package org.usfirst.frc.team5987.robot.subsystems;

import org.usfirst.frc.team5987.robot.RobotMap;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class gripperSubsystem extends Subsystem {
	
    Victor gripperLeft = new Victor (RobotMap.gripperWheelLeft);
    Victor gripperRight = new Victor (RobotMap.gripperWheelRight);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    public gripperSubsystem(){
    	
    	gripperLeft.setInverted(true);
    	gripperRight.setInverted(false);
    	
    }
    
    public void setSpeed(double speed){
    	
    	gripperLeft.set(speed);
    	gripperRight.set(speed);
    }
    
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    

}

