/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.Team61Robot.commands;

/**
 *
 * @author FrankAdmin
 */
public class AutoDriveSeq4 extends CommandBase {
    
    private int seq = 4;
    
    public AutoDriveSeq4() {
        // Use requires() here to declare subsystem dependencies
        requires(drivetrain);
        setTimeout(autoDriveTime[seq]);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        drivetrain.tankDrive(autoLeftSpeed[seq]*-1.0,autoRightSpeed[seq]);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
