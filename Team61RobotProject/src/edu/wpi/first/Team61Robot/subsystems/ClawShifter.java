/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.Team61Robot.subsystems;

import edu.wpi.first.Team61Robot.RobotMap;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Jack Cone
 */
public class ClawShifter extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    private Solenoid rightClawUp = new Solenoid (RobotMap.rightClawUpSolenoid) ;
    private Solenoid leftClawUp = new Solenoid (RobotMap.leftClawUpSolenoid) ;
    private Solenoid rightClawDown = new Solenoid (RobotMap.rightClawDownSolenoid) ;
    private Solenoid leftClawDown = new Solenoid (RobotMap.leftClawDownSolenoid) ;

   
    
    ;
            
       
    
    
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

   /**
    *   Tells the claw shifter to do nothing.
    */
    public void doNothing() {
        ;
    }
    
    public void shiftLeftDown(boolean on) {
       leftClawDown.set(on);
    }
    
    public void shiftLeftUp(boolean on) {
       leftClawUp.set(on);
    }
    
    public void shiftRightDown(boolean on) {
       rightClawDown.set(on);
    }

    public void shiftRightUp(boolean on){
       rightClawUp.set(on);
    }



}





