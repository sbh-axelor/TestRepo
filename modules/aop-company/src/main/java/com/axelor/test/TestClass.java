package com.axelor.test;

import java.math.BigDecimal;

import org.eclipse.birt.chart.extension.aggregate.Percentile;

import com.aop.company.db.Employee;
import com.axelor.rpc.ActionRequest;
import com.axelor.rpc.ActionResponse;

public class TestClass {
	
	public void testMethod(ActionRequest request, ActionResponse response) {
		Employee employee=request.getContext().asType(Employee.class);
		BigDecimal ctc = employee.getCtc();
		response.setValue("phone", ctc);
	}
}
