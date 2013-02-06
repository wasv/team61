package edu.wpi.first.Team61Robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.Team61Robot.OI;
import edu.wpi.first.Team61Robot.subsystems.ClawShifter;
import edu.wpi.first.Team61Robot.subsystems.DriveTrain;
import edu.wpi.first.Team61Robot.subsystems.Dumper;

import edu.wpi.first.Team61Robot.subsystems.Shifter;


/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use CommandBase.exampleSubsystem
 * @author Author
 */
public abstract class CommandBase extends Command {

    public static OI oi;
    // Create a single static instance of all of your subsystems
    
    public static DriveTrain drivetrain = new DriveTrain();
    public static Shifter shifter = new Shifter ();
    public static ClawShifter clawShifter = new ClawShifter() ;
    public static Dumper dumper = new Dumper();
    
    
    
    public static double autoLeftSpeed[]        = { -0.5, -0.4, -0.5, -0.4, -0.5 };
    public static double autoRightSpeed[]       = { -0.5, 0.4, -0.5, 0.4, -0.5 };
    public static double autoDriveTime[]        = { 1.0, 0.55, 0.5, 0.55, 1.0 };
            
    public static void init() {
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        oi = new OI();

        // Show what command your subsystem is running on the SmartDashboard
     
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
    
 
}
