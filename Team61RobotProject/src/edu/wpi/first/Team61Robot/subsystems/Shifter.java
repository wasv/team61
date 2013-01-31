/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.Team61Robot.subsystems;

import edu.wpi.first.Team61Robot.RobotMap;
import edu.wpi.first.Team61Robot.commands.ShiftToDrive;
import edu.wpi.first.Team61Robot.commands.ShifterDoNothing;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Jack Cone
 */
public class Shifter extends Subsystem {
    
private boolean debugging = true;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
   
private Solenoid driveShift = new Solenoid (RobotMap.driveSolenoid) ;
private Solenoid armShift = new Solenoid (RobotMap.armSolenoid) ;
 

public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new ShifterDoNothing());
   
    
    }
    public void doNothing() {
        ;
    }
public void shiftToDriveOn ()
{
//insert command here     
    if (debugging) {
        System.out.println("shiftToDrive - before");
        System.out.println("Drive Solenoid set to " + driveShift.get());
        System.out.println("Arm Solenoid set to  " + armShift.get());
    }
    driveShift.set(true);
    if (debugging) {
        System.out.println("shiftToDrive - after");
        System.out.println("Drive Solenoid set to " + driveShift.get());
        System.out.println("Arm Solenoid set to  " + armShift.get());
    }
 }
public void shiftToDriveOff ()
{
//insert command here     
    if (debugging) {
        System.out.println("shiftToDrive - before");
        System.out.println("Drive Solenoid set to " + driveShift.get());
        System.out.println("Arm Solenoid set to  " + armShift.get());
    }
    driveShift.set(false);
    if (debugging) {
        System.out.println("shiftToDrive - after");
        System.out.println("Drive Solenoid set to " + driveShift.get());
        System.out.println("Arm Solenoid set to  " + armShift.get());
    }
 }
public void shiftToClimbOn ()

{
    if (debugging) {
        System.out.println("shiftToClimb - before");
        System.out.println("Drive Solenoid set to " + driveShift.get());
        System.out.println("Arm Solenoid set to  " + armShift.get());
    }
    armShift.set(true);

    if (debugging) {
        System.out.println("shiftToClimb - after");
        System.out.println("Drive Solenoid set to " + driveShift.get());
        System.out.println("Arm Solenoid set to  " + armShift.get());
    }
}       
public void shiftToClimbOff ()

{
    if (debugging) {
        System.out.println("shiftToClimb - before");
        System.out.println("Drive Solenoid set to " + driveShift.get());
        System.out.println("Arm Solenoid set to  " + armShift.get());
    }
    armShift.set(false);

    if (debugging) {
        System.out.println("shiftToClimb - after");
        System.out.println("Drive Solenoid set to " + driveShift.get());
        System.out.println("Arm Solenoid set to  " + armShift.get());
    }
}           
        
        
        
}       
