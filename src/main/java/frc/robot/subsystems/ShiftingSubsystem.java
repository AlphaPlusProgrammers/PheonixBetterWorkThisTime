// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShiftingSubsystem extends SubsystemBase {
  /** Creates a new ShiftingSubsystem. */
  private DoubleSolenoid shiftingSol;
  public Boolean low;
  public ShiftingSubsystem() {

    shiftingSol = new DoubleSolenoid(0, 7);
    low = true;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
    public void shiftToLowGear() {
      shiftingSol.set(Value.kReverse);
      low = true;
  }

  public void shiftToHighGear() {
      shiftingSol.set(Value.kForward);
      low = false;
  }

  public void shifting(){
    if (low){
      shiftToHighGear();
    }else{
      shiftToLowGear();
    }
  }


}
