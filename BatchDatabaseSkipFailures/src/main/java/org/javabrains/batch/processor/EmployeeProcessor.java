/**
 * 
 */
package org.javabrains.batch.processor;

import java.util.Date;

import org.javabrains.batch.beans.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

/**
 * @author Yashoda
 *
 */
public class EmployeeProcessor implements ItemProcessor<Employee,Employee>
{
  private static final Logger logger = LoggerFactory.getLogger(EmployeeProcessor.class);
  
  public Employee process(Employee employee) throws Exception 
  {  
    Employee processedEmployee = new Employee();
    processedEmployee = employee;
    
    processedEmployee
        .setCostToCompany(12 * employee.getMonthlySalary() + employee.getVariablePay());
    
    long operandOne = new Date().getTime();
    long operandTwo = employee.getJoiningDate().getTime();
    
    long divisor = new Long("31556900000").longValue();
    
    double expInYears = (operandOne - operandTwo)/divisor;
    processedEmployee.setWorkExperience(expInYears);
    
    logger.info("Processing employee ... " + processedEmployee);
    
    return processedEmployee;
  }

}
