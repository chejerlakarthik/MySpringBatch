/**
 * 
 */
package org.javabrains.batch.beans;

import java.util.Date;


/**
 * @author Yashoda
 * 
 */
public class Employee {

  private long employeeId;
  private String employeeName;
  private String companyName;
  private String designation;
  private Date joiningDate;
  private double monthlySalary;
  private double workExperience;
  private double variablePay;
  private double costToCompany;

  /**
   * @return the employeeId
   */
  public long getEmployeeId() {
    return employeeId;
  }

  /**
   * @param employeeId the employeeId to set
   */
  public void setEmployeeId(long employeeId) {
    this.employeeId = employeeId;
  }

  /**
   * @return the employeeName
   */
  public String getEmployeeName() {
    return employeeName;
  }

  /**
   * @param employeeName the employeeName to set
   */
  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  /**
   * @return the companyName
   */
  public String getCompanyName() {
    return companyName;
  }

  /**
   * @param companyName the companyName to set
   */
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  /**
   * @return the designation
   */
  public String getDesignation() {
    return designation;
  }

  /**
   * @param designation the designation to set
   */
  public void setDesignation(String designation) {
    this.designation = designation;
  }

  /**
   * @return the joiningDate
   */
  public Date getJoiningDate() {
    return joiningDate;
  }

  /**
   * @param joiningDate the joiningDate to set
   */
  public void setJoiningDate(Date joiningDate) {
    this.joiningDate = joiningDate;
  }

  /**
   * @return the monthlySalary
   */
  public double getMonthlySalary() {
    return monthlySalary;
  }

  /**
   * @param monthlySalary the monthlySalary to set
   */
  public void setMonthlySalary(double monthlySalary) {
    this.monthlySalary = monthlySalary;
  }

  /**
   * @return the workExperience
   */
  public double getWorkExperience() {
    return workExperience;
  }

  /**
   * @param workExperience the workExperience to set
   */
  public void setWorkExperience(double workExperience) {
    this.workExperience = workExperience;
  }

  /**
   * @return the variablePay
   */
  public double getVariablePay() {
    return variablePay;
  }

  /**
   * @param variablePay the variablePay to set
   */
  public void setVariablePay(double variablePay) {
    this.variablePay = variablePay;
  }

  /**
   * @return the costToCompany
   */
  public double getCostToCompany() {
    return costToCompany;
  }

  /**
   * @param costToCompany the costToCompany to set
   */
  public void setCostToCompany(double costToCompany) {
    this.costToCompany = costToCompany;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName
        + ", companyName=" + companyName + ", designation=" + designation + ", joiningDate="
        + joiningDate + ", monthlySalary=" + monthlySalary + ", workExperience=" + workExperience
        + ", variablePay=" + variablePay + ", costToCompany=" + costToCompany + "]";
  }
}
