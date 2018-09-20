package org.usfirst.frc.team5987.robot.subsystems;

import org.usfirst.frc.team5987.robot.RobotMap;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import auxiliary.Watch_Dogeable;
/**
 *
 */
public class intakeSubsystem extends Subsystem implements Watch_Dogeable {
	
	Victor intakeLeft = new Victor (RobotMap.intakeMotorLeft);
    Victor intakeRight = new Victor (RobotMap.intakeMotorRight);
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    public intakeSubsystem(){
    	
    	intakeLeft.setInverted(true);
    	intakeRight.setInverted(false);
    	
    }
    
    public void setSpeed(double speed){
    	
    	intakeLeft.set(speed);
    	intakeRight.set(speed);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

	@Override
	public void bork() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void necromancy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean wakeMeUp() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ded() {
		// TODO Auto-generated method stub
		return false;
	}
}

