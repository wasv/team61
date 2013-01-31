/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.Team61Robot.subsystems;

import edu.wpi.first.Team61Robot.RobotMap;
import edu.wpi.first.Team61Robot.commands.ShiftToWheel;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Jack Cone
 */
public class FifthShifter extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    private Solenoid wheelShift = new Solenoid(RobotMap.wheelSolenoid);
    private Solenoid shooterShift = new Solenoid(RobotMap.shooterSolenoid);
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new ShiftToWheel());
    }
    
    public void shiftToWheel ()
    {
        wheelShift.set(true);      
    }
    public void shiftToShooter ()
    {
        shooterShift.set(true);
    } 
}
