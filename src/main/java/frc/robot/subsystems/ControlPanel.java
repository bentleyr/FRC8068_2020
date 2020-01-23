/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.util.Color;

import com.revrobotics.ColorMatch;
import com.revrobotics.ColorMatchResult;
import com.revrobotics.ColorSensorV3;

public class ControlPanel extends SubsystemBase {
  /**
   * Creates a new ControlPanel.
   */
  
  private final I2C.Port i2cPort = I2C.Port.kOnboard;
  private final ColorSensorV3 m_colorSensor = new ColorSensorV3(i2cPort);
  private final ColorMatch m_colorMatcher = new ColorMatch();

  private final Color kBlueTarget = ColorMatch.makeColor(0.143, 0.427, 0.429);
  private final Color kGreenTarget = ColorMatch.makeColor(0.197, 0.561, 0.240);
  private final Color kRedTarget = ColorMatch.makeColor(0.561, 0.232, 0.114);
  private final Color kYellowTarget = ColorMatch.makeColor(0.361, 0.524, 0.113);

  int proximity = m_colorSensor.getProximity();

  public ControlPanel() {
    m_colorMatcher.addColorMatch(kBlueTarget);
    m_colorMatcher.addColorMatch(kGreenTarget);
    m_colorMatcher.addColorMatch(kRedTarget);
    m_colorMatcher.addColorMatch(kYellowTarget);

  }

  @Override
  public void periodic() {
    Color detectedColor = m_colorSensor.getColor();

    //System.out.println("Red" + detectedColor.red + "Green" + detectedColor.green + "Blue" + detectedColor.blue + "Distance" + proximity);
    //System.out.println("Most likely color : " + m_colorSensor.getColor().);
    ColorMatchResult match = m_colorMatcher.matchClosestColor(detectedColor);
    if(match.color == kBlueTarget)
    {
      System.out.println("Detected color : blue");
    }
    else if(match.color == kRedTarget)
    {
      System.out.println("Detected color : red");
    }
    else if(match.color == kGreenTarget)
    {
      System.out.println("Detected color : green");
    }
    else if(match.color == kYellowTarget)
    {
      System.out.println("Detected color : yellow");
    }
    else
    {
      System.out.println("Color unknown");
    }
  }
}
