package com.myspace.workitemhandler;

import java.util.HashMap;
import java.util.Map;

import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GenericWorkItemHandler implements WorkItemHandler {

	private static Logger logger = LoggerFactory.getLogger(GenericWorkItemHandler.class);
	
	@Override
	public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {
		// TODO Auto-generated method stub

		com.myspace.person.Person person = (com.myspace.person.Person) workItem.getParameter("person");
		logger.info(" Person Details  "+ person.getFirstName() + "  "+person.getLastName());
		
		com.myspace.person.Address adress = person.getLocations().stream().filter(l ->"Permanenet".equals(l.getLocationType()))
																			.findFirst()
																			.orElse(null);
		
		if (null != adress) {
			logger.info(adress.getDoor()+" " +adress.getArea()+ " "+adress.getLandMark()+" "+adress.getLocationType());
			adress.setLandMark("New Hyderabad");
		}

		System.out.println("Work Item ID " + workItem.getId());
		
		Map<String, Object> personMap = new HashMap<String, Object>();
		personMap.put("personResult", person);
		manager.completeWorkItem(workItem.getId(), personMap);
	

	}

	@Override
	public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {}

}
