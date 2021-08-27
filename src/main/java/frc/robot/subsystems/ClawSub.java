// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;

public class ClawSub extends SubsystemBase {
  /** Creates a new ClawSub. */
  private Solenoid clawSolenoid;
  public Boolean handlerPos;
  public ClawSub() {
    clawSolenoid = new Solenoid(3);
    handlerPos = false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

    public void lowerClaw() {
      clawSolenoid.set(true);
      handlerPos = true;
  }

// This raises the claw
  public void raiseClaw() {
      clawSolenoid.set(false);
      handlerPos = false;
  }

      /**
     * lowers or raises the claw while checking for the claw extension.
     * 
     * @param upOrDown - (string) "up" to raise the claw "down" to drop the claw
     * 
     * @return (void)
     */

  public void safelyControl(String upOrDown){
    if(RobotContainer.intakeSub.handlerPositionSetting);
  }

}
