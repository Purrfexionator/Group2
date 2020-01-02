/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  public static Spark frontL, frontR, backL, backR;
  public static Solenoid ramp;
  public static SpeedControllerGroup left, right;
  public static DifferentialDrive drive;

  public static void init() {
    frontL = new Spark(Constants.FRONT_LEFT);
    frontR = new Spark(Constants.FRONT_RIGHT);
    backL = new Spark(Constants.BACK_LEFT);
    backR = new Spark(Constants.BACK_RIGHT);

    left = new SpeedControllerGroup(frontL, backL);
    right = new SpeedControllerGroup(backL, backR);

    drive = new DifferentialDrive(left, right);
    drive.setSafetyEnabled(false);

    ramp = new Solenoid(Constants.PCM, Constants.RAMP);
    ramp.set(false);
  }

}
