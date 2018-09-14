
package org.usfirst.frc.team5987.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team5987.robot.Robot;

/**
 *
 */
public class DriveCommand extends Command {
	
	Timer wait = new Timer();

    public DriveCommand() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.driveSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	wait.reset();
    	wait.start();
    	Robot.driveSubsystem.setSpeed(0.05,0.05);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {    	
    	return wait.get() > 0.99;
    }

    // Called once after isFinished returns true
    protected void end() {
    	wait.stop();
    	Robot.driveSubsystem.setSpeed(0,0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
