package com.sample;

import org.jbpm.test.JbpmJUnitBaseTestCase;
import org.junit.Test;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.manager.RuntimeEngine;
import org.kie.api.runtime.process.ProcessInstance;

public class ProcessTest extends JbpmJUnitBaseTestCase {
	
	@Test
	public void processTest() {
		RuntimeEngine runtimeEngine = getRuntimeEngine();
	      KieSession ksession = runtimeEngine.getKieSession();
	      ProcessInstance processInstance = ksession.startProcess("com.sample.HelloWorld");
	      assertProcessInstanceCompleted(processInstance.getId());
	      disposeRuntimeManager();
	}
}
