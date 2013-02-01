/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.Team61Robot.commands;

/**
 *
 * @author Jack Cone
 */
public class RightClawDown extends CommandBase {
    
    public RightClawDown() {
        // Use requires() here to declare subsystem dependencies
        requires(clawShifter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
     setTimeout(0.2);
    
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    clawShifter.shiftRightDown(true);
    
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        
        clawShifter.shiftRightDown(false);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}