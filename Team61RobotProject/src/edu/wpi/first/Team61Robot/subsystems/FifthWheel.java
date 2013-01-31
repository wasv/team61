/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.Team61Robot.subsystems;

import edu.wpi.first.Team61Robot.RobotMap;
import edu.wpi.first.Team61Robot.commands.FifthWheelGo;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author FrankAdmin
 */
public class FifthWheel extends Subsystem {
  SpeedController motor = new Victor(RobotMap.fifthWheelMotor);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new FifthWheelGo());
    }
    public void go(double speed)
    { 
    motor.set(speed) ;
    
    }
    public void doNothing() {
        motor.set(0);
    }
}


