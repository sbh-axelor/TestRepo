package com.aop.company.web;

import java.util.Date;

import com.aop.company.db.Project;
import com.aop.company.service.ProjectService;
import com.axelor.inject.Beans;
import com.axelor.rpc.ActionRequest;
import com.axelor.rpc.ActionResponse;

public class ProjectController {
	
	public void record(ActionRequest request, ActionResponse response) {
		
		// send a request to connect to the particular class (assign this to the obj of the same class)
		Project project=request.getContext().asType(Project.class);
		//get the field of class (assign it to the datatype variable name
//		ProjectService projectRecordDate = Beans.get(ProjectService.class);
		
		String message = "Project Name - " + project.getName();
						 
		/*
		 * "Project ID - " + project.getId().toString() + " Record Date - " +
		 * project.getProjectRecordDate().toString();
		 */
		
		response.setAlert(message);
		
		/* response.setAlert(message); */
		
		/* response.setValue("name", message); */
	}

}
