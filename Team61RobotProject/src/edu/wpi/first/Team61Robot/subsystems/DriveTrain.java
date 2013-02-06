/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.Team61Robot.subsystems;

import edu.wpi.first.Team61Robot.RobotMap;
import edu.wpi.first.Team61Robot.commands.DriveWithJoysticks;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.PIDSubsystem;

/**
 *
 * @author FrankAdmin
 */
public class DriveTrain extends PIDSubsystem {
    
    private boolean debugging = true;

    private static final double Kp = 0.0;
    private static final double Ki = 0.0;
    private static final double Kd = 0.0;
    
    //private RobotDrive drive = new RobotDrive(RobotMap.leftMotor,RobotMap.rightMotor);
    
    private SpeedController leftMotor = new Victor(RobotMap.leftMotor);
    private SpeedController rightMotor = new Victor(RobotMap.rightMotor);
    
    // private DigitalInput leftTopLimit = new DigitalInput(RobotMap.leftTopLimitChannel);
    // private DigitalInput leftBottomLimit = new DigitalInput(RobotMap.leftBottomLimitChannel);
    private DigitalInput rightTopLimit = new DigitalInput(RobotMap.rightTopLimitChannel);
    private DigitalInput rightBottomLimit = new DigitalInput(RobotMap.rightBottomLimitChannel);

    // Initialize your subsystem here
    public DriveTrain() {
        super("DriveTrain", Kp, Ki, Kd);

        // Use these to get going:
        // setSetpoint() -  Sets where the PID controller should move the system
        //                  to
        // enable() - Enables the PID controller.
        
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveWithJoysticks());
    }
    
    protected double returnPIDInput() {
        // Return your input value for the PID loop
        // e.g. a sensor, like a potentiometer:
        // yourPot.getAverageVoltage() / kYourMaxVoltage;
        return 0.0;
    }
    
    protected void usePIDOutput(double output) {
        // Use output to drive your system, like a motor
        // e.g. yourMotor.set(output);
    }
    
    public void tankDrive(double left, double right) {
        leftMotor.set(left);
        rightMotor.set(right);
    }
    
    public void reverseTankDrive(double left, double right) {
        leftMotor.set(right);
        rightMotor.set(left);
    }
    
    public void climb(double left, double right) {
        moveLeftArm(right);
        moveRightArm(right);
    }
    
    private void moveLeftArm(double speed)
    {
        leftMotor.set(speed);
        /*
        if (speed > 0.0 && leftTopLimit.get())
        {
            leftMotor.set(0.0);
        }
        else if (speed < 0.0 && leftBottomLimit.get())
        {
            leftMotor.set(0.0);
        }
        else
        {
            leftMotor.set(speed);
        }
         */
    }
    
    private void moveRightArm(double speed)
    {
        rightMotor.set(speed);
        /*
        if (speed > 0.0 && rightTopLimit.get())
        {
            rightMotor.set(0.0);
        }
        else if (speed < 0.0 && rightBottomLimit.get())
        {
            rightMotor.set(0.0);
        }
        else
        {
            rightMotor.set(speed);
        }
        */
    }
}
