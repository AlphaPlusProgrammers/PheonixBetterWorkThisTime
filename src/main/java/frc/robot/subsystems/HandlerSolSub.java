// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class HandlerSolSub extends SubsystemBase {
  /** Creates a new HandlerSolSub. */

  public Solenoid placementSol;

  public boolean name;

  public HandlerSolSub() {
    placementSol = new Solenoid(2);

    name = false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void placerIn(){
    placementSol.set(true);
  }

  public void placerOut(){
    placementSol.set(false);
  }
  
}
