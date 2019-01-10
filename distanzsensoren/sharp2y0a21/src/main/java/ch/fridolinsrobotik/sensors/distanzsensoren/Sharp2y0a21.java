/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package ch.fridolinsrobotik.sensors.distanzsensoren;

import edu.wpi.first.wpilibj.AnalogInput;

/**
 * Add your docs here.
 */
public class Sharp2y0a21 {
    AnalogInput pin;

    Sharp2y0a21(AnalogInput pin) {
        this.pin = pin;
    }
    double getDistance() {
        return Math.pow(3027.4/this.pin.getValue(), 1.2134);
    }
}
