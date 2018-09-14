package org.usfirst.frc.team5987.robot.commands;

import org.usfirst.frc.team5987.robot.Constants;
import org.usfirst.frc.team5987.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class EatCubeByTimeCommand extends Command {
	
	Timer wait = new Timer();
	
	private double timeToWait = 0;
	
    public EatCubeByTimeCommand(double time) {
    	
    	requires(Robot.intakeSubsystem);
    	requires(Robot.gripperSubsystem);
    	timeToWait = time;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	wait.reset();
    	wait.start();
    	Robot.intakeSubsystem.setSpeed(Constants.intakeSpeedIn);
    	Robot.gripperSubsystem.setSpeed(Constants.gripperSpeedIn);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return wait.get() > timeToWait;
    }

    // Called once after isFinished returns true
    protected void end() {
    	wait.stop();
    	Robot.intakeSubsystem.setSpeed(0);
    	Robot.gripperSubsystem.setSpeed(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
