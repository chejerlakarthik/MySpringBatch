/**
 * 
 */
package org.javabrains.batch.processor;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.javabrains.batch.beans.Employee;
import org.springframework.batch.item.database.ItemPreparedStatementSetter;

/**
 * @author Yashoda
 * 
 */
public class EmployeePreparedStatementSetter implements ItemPreparedStatementSetter<Employee> {

  public void setValues(Employee employee, PreparedStatement statement) throws SQLException {

    statement.setLong(1, employee.getEmployeeId());
    statement.setString(2, employee.getEmployeeName());
    statement.setString(3, employee.getCompanyName());
    statement.setString(4, employee.getDesignation());
    statement.setDouble(5, employee.getMonthlySalary());
    statement.setDouble(6, employee.getWorkExperience());
    statement.setDouble(7, employee.getVariablePay());
    statement.setDouble(8, employee.getCostToCompany());
    statement.setDate(9, new java.sql.Date(employee.getJoiningDate().getTime()));
  }

}
