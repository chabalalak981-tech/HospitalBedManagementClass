/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hospitalbedmanagementclass;

/**
 *
 * @author Student
 */
public class HosptitalBed {
    
    
    private String bedNumber;
    private boolean occupied;
    private String patientId;
    
    public HosptitalBed(String bedNumber, boolean occupied, String patientId){
        this.bedNumber = bedNumber;
        this.occupied = false;
        this.patientId = null;
                
    }
    public String getBedNumber(){
        return bedNumber;
    }
    public boolean isOccupied(){
        return occupied;
    }
    public String getPatientId(){
        return patientId;
    }
    public void allocatedBed(String patientId){
        this.occupied = true;
        this.patientId = patientId;
    }
    public void releaseBed(){
        this.occupied = false;
        this.patientId = null;
    }
        
    
    
}
