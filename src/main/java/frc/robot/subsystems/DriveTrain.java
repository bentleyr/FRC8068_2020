/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.LogitechGamePad;


//import edu.wpi.first.wpilibj.DoubleSolenoid;
//import edu.wpi.first.wpilibj.Joystick;

public class DriveTrain extends SubsystemBase {
  /**
   * Creates a new ExampleSubsystem.
   */
  private final Joystick m_DriverJoystick = new Joystick(0);
  private final Joystick m_OperatorJoystick = new Joystick(1);

  public DriveTrain() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run

    m_DriverJoystick.getRawAxis(LogitechGamePad.LEFT_X_AXIS);
  }
}
