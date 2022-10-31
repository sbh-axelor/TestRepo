package com.aop.company.web;

import java.util.Map;

import com.aop.company.db.Employee;
import com.aop.company.service.SalaryService;
import com.axelor.inject.Beans;
import com.axelor.rpc.ActionRequest;
import com.axelor.rpc.ActionResponse;

public class SalaryController {
	public void SalaryDet(ActionRequest request, ActionResponse response) {
		/*
		 * Map<String, Object> context = request.getData(); Map<String, Object>
		 * contextMap = (Map<String, Object>) context.get("context");
		 * 
		 * System.out.println(contextMap.toString());
		 * 
		 * String btnSource = contextMap.get("ctc").toString();
		 * System.out.println("\n CTC is " + btnSource);
		 */
		
		Employee emp= request.getContext().asType(Employee.class);
		SalaryService s1= Beans.get(SalaryService.class);
		
	
		response.setFlash(s1.getSalaryDetails(emp));
		
		
		
	}

}
