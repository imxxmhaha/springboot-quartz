package com.quartz.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**  
* @ClassName: HelloJob  
* @Description: TODO()  
* @author lixin(1309244704@qq.com)  
* @date 2018年3月15日 上午10:02:16  
* @version V1.0  
*/
public class XxmJob implements BaseJob {

    private static Logger _log = LoggerFactory.getLogger(XxmJob.class);

    public XxmJob() {
          
    }  
     
    public void execute(JobExecutionContext context)  
        throws JobExecutionException {
        System.err.println("Xxm Job执行时间: " + new Date());
    }  
}  
