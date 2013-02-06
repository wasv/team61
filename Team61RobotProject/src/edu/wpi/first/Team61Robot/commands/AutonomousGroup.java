/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.Team61Robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 * @author FrankAdmin
 */
public class AutonomousGroup extends CommandGroup {
    
    public AutonomousGroup() {
        
        // addSequential(new AutoDriveSeq0());
        // addSequential(new AutoDriveSeq1());
        // addSequential(new AutoDriveSeq2());
        // addSequential(new AutoDriveSeq3());
        // addSequential(new AutoDriveSeq4());

        if ((CommandBase.autoDriveTime.length == CommandBase.autoRightSpeed.length) && (CommandBase.autoRightSpeed.length == CommandBase.autoLeftSpeed.length))
        {
            for (int i=0;i<CommandBase.autoDriveTime.length;i++)
            {
                addSequential(new AutoLooping(i));
            }
        }
        else
        {
            System.err.println("[FATAL] Could not start autonomous because array lengths are not equal!");
            System.err.println("[FATAL] autoDriveTime.length: " + CommandBase.autoDriveTime.length + "; autoRightSpeed.length: " + CommandBase.autoRightSpeed.length + "; autoLeftSpeed.length: " + CommandBase.autoLeftSpeed.length);
            
        }
        // addSequential(new AutoDrive(leftSpeed, rightSpeed, time));
        // addSequential(new AutoTurn(direction, time));
        
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
