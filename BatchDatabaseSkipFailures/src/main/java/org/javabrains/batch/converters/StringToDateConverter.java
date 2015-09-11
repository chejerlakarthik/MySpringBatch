/**
 * 
 */
package org.javabrains.batch.converters;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.convert.converter.Converter;

/**
 * @author Yashoda
 * 
 */
public class StringToDateConverter implements Converter<java.lang.String,java.util.Date> {

  private static final Logger logger = LoggerFactory.getLogger(StringToDateConverter.class);
  
  public Date convert(String stringToConvert) 
  {
    logger.info("Custom converter invoked to convert (java.lang.String) to (java.util.Date) ");
    DateFormat format = new SimpleDateFormat("MM-dd-yyyy");
    Date stringAsDate = null;
    try 
    {
      stringAsDate = format.parse(stringToConvert);
    } 
    catch (ParseException e) 
    {  
      logger.error("Conversion error when converting " + stringToConvert + " to Date format");
      logger.error(e.getMessage());
    }
    return stringAsDate;
  }
}
