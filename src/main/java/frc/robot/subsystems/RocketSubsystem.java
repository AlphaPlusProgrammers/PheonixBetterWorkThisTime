// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class RocketSubsystem extends SubsystemBase {
  /** Creates a new RocketSubsystem. */
  private Solenoid rocketPlacementSolenoid;
  public boolean extended;

  public RocketSubsystem() {
    rocketPlacementSolenoid = new Solenoid(2);

    extended = false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void rocketPlacementForward() {
    rocketPlacementSolenoid.set(true);
    extended = true;
  }
  public void rocketPlacementBackward() {
      rocketPlacementSolenoid.set(false);
      extended = false;
  }

  public void extendFunction(){
    if(extended){
      rocketPlacementBackward();
    }else{
      rocketPlacementForward();
    }
  }
}
