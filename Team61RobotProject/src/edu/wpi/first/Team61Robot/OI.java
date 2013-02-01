
package edu.wpi.first.Team61Robot;

import edu.wpi.first.Team61Robot.commands.ShiftToClimb;
import edu.wpi.first.Team61Robot.commands.ShiftToDrive;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.

    Joystick jLeft = new Joystick(1);    
    Joystick jRight = new Joystick(2);   
    Joystick jThree = new Joystick(3);
    Joystick jFour = new Joystick(4);
   Button driveButton = new JoystickButton(jLeft, 1);
   Button climbButton = new JoystickButton(jRight, 1);
   Button rightClaw = new JoystickButton(jThree, 1);
   Button leftClaw = new JoystickButton(jFour, 1);
   Button forwardButton = new JoystickButton (jRight,2);
   Button reverseButton = new JoystickButton (jRight,3) ; 
   
   
   private static boolean driveMode = true;
   private static boolean reverseDriveMode=false ;
   public static boolean rightClawUp = true;
   public static boolean leftClawUp = true; 
   
    // Button shootButton = new JoystickButton(jShooter, 1);
    
    // Anstatother type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    
    public OI() {
        
        
      
      driveButton.whenPressed (new ShiftToDrive());
      climbButton.whenPressed (new ShiftToClimb());
        
      

    }
    /**
     *  Check drive and climb buttons to see if they are current;y pressed
     *  and set driveMode variable accordingly
     *  
     *  Note: if both are pressed, drive mode will take precedence
     * 
     * @return boolean 
     *         true means we are in driving mode 
     *         false means we are in climbing mode 
     */
    public boolean weAreDriving() {
        
        // jLeft.getButton(Joystick.ButtonType.kTrigger);
        
        if (driveButton.get()) {
            driveMode = true;
        }
        else if (climbButton.get()) {
            driveMode = false;
        }
        return driveMode;
    }
    public boolean weAreReversing (){
        
        if (reverseButton.get()) {
            reverseDriveMode = false;
        }
    else if (forwardButton.get()) {
        reverseDriveMode= true;
    }
    return reverseDriveMode ;
    }
    
    public double getLeftSpeed() {
        return (jLeft.getY()); 
    }
    
    public double getRightSpeed() {
        return (jRight.getY());
    }
    

    
}

