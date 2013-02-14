/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.Team61Robot.subsystems;

import edu.wpi.first.Team61Robot.RobotMap;
import edu.wpi.first.Team61Robot.commands.DumperDoNothing;
import edu.wpi.first.Team61Robot.commands.DumperIn;
import edu.wpi.first.Team61Robot.commands.DumperOut;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Jack Cone
 */
public class Dumper extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    private Solenoid dumperOut = new Solenoid(RobotMap.dumperOutSolenlid);
    private Solenoid dumperIn = new Solenoid(RobotMap.dumperInSolenlid);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand (new DumperDoNothing());
    }
    
    
      public void moveOut(boolean on) {
        DumperOut.set(on);
    }
    
    public void moveIn(boolean on) {
        DumperIn.set(on);
    }

    public void doNothing() {
    }
}
