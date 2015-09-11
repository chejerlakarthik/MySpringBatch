/**
 * 
 */
package org.javabrains.batch.tester;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author Yashoda
 *
 */
public class BatchDatabaseTester {

  private static final Logger logger = LoggerFactory.getLogger(BatchDatabaseTester.class);
  /**
   * @param args 
   */
  public static void main(String[] args) 
  {
    GenericXmlApplicationContext context = new GenericXmlApplicationContext();
    context.registerShutdownHook();
    
    context.load("job-configuration.xml");
    context.refresh();
    
    JobLauncher jobLauncher = context.getBean("jobLauncher", JobLauncher.class);
    Job job = context.getBean("employeeCreationBatch", Job.class);
    
    try 
    {
      if(args.length < 2)
      {
        logger.error("At least 2 parameters need to be passed to the job. Found only " + args.length + " parameter(s)");
      }
      
      logger.info("Initializing batch job execution .......");
      
      jobLauncher.run(job, new JobParametersBuilder().addString("runDate", args[0]).addString("inputFileName", args[1])
                                .toJobParameters());
    } 
    catch (JobExecutionAlreadyRunningException e)
    {
      logger.error("A job execution is already running !! Please see job metadata.");
      logger.error(e.getMessage());
    } 
    catch (JobRestartException e) 
    {
      logger.error("Job restart failed !!");
      logger.error(e.getMessage());
    } 
    catch (JobInstanceAlreadyCompleteException e) 
    {
      logger.error("Job has already completed execution !!");
      logger.error(e.getMessage());
    }
    catch (JobParametersInvalidException e)
    {   
      logger.error("Invalid/Insufficient job parameters");
      logger.error(e.getMessage());
    }
    finally
    {
      logger.info("Closing the Spring application context !!");
      context.close(); 
    }
  }

}
