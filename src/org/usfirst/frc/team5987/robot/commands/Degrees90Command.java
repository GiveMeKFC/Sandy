package org.usfirst.frc.team5987.robot.commands;

import org.usfirst.frc.team5987.robot.Constants;
import org.usfirst.frc.team5987.robot.Robot;
import org.usfirst.frc.team5987.robot.RobotMap;
import org.usfirst.frc.team5987.robot.subsystems.driveSubsystem;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Degrees90Command extends Command {
	
	double startPositionLeft = 0;
	double startPositionRight = 0;
	
    public Degrees90Command() {
     
    	requires(Robot.driveSubsystem);
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    	startPositionLeft = Robot.driveSubsystem.getLeftDistance();
    	startPositionRight = Robot.driveSubsystem.getRightDistance();
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	  		
    	Robot.driveSubsystem.setSpeed(-Constants.driveSpeedInAuto, Constants.driveSpeedInAuto);
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	
    	double Left = -(startPositionLeft-Robot.driveSubsystem.getLeftDistance());
    	double Right = (startPositionRight-Robot.driveSubsystem.getRightDistance());
    	double avr = (Left + Right) / 2;
        return avr > 0.522025/2;
    }

    // Called once after isFinished returns true
    protected void end() {

    	Robot.driveSubsystem.setSpeed(0, 0);
    	
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
