/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 * Add your docs here.
 */
public class ToggleSolenoid extends InstantCommand {
  /**
   * Add your docs here.
   */
  private Solenoid solenoid;
  public ToggleSolenoid(Solenoid solenoid) {
    super();
    this.solenoid = solenoid;
  }

  // Called once when the command executes
  @Override
  protected void initialize() {
    solenoid.set(!solenoid.get());
  }

}
