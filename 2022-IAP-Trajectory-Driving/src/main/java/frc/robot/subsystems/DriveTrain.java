package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.drive.RobotDriveBase;
import edu.wpi.first.wpilibj.interfaces.Gyro;

public class DriveTrain{
        int P, I, D = 1;
        int integral, previous_error, setpoint = 0;
        Gyro gyro;
        
    
        public void setSetpoint()
        {
          
        }
    
        public void PID(){
            Gyro gyro;
            
        }
    
        public void execute()
        {
            PID();
            
        }
    }
    
