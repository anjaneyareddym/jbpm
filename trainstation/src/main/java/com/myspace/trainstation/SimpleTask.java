package com.myspace.trainstation;

import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

//public class SimpleTask implements WorkItemHandler {
public class SimpleTask implements WorkItemHandler {
	
	public static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger("com.jbpm") ;
	public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {
		// TODO Auto-generated method stub
		
		String countVal =(String) workItem.getParameter("count");
		int count = Integer.parseInt(countVal);
		while(count > 0) {
			
			logger.info("Inside WorkItemHandler "+count+count+count+ "::::" +count);
			
			count--;
			
		}
		
		try {
		 int j = 4/count;
		}
		catch (Exception ex) {
			// TODO: handle exception
			
			POCHandlerException poc =new POCHandlerException(ex.getMessage());
			
			//handleException(poc);
			logger.error(ex.getMessage());
		}
		
	}

	public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
		// TODO Auto-generated method stub

	}

}
