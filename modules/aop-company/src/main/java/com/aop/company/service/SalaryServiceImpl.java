package com.aop.company.service;

import java.math.BigDecimal;
import java.math.MathContext;

import com.aop.company.db.Employee;

public class SalaryServiceImpl implements SalaryService {
	

	@Override
	public String getSalaryDetails(Employee emp1)
	{
		String newline = System.getProperty("line.separator");
		String empName = emp1.getEmpFullName();
		BigDecimal  ctc = emp1.getCtc();
		BigDecimal base  = ctc.multiply(BigDecimal.valueOf(0.4)).setScale(2, BigDecimal.ROUND_UP);
		BigDecimal hra  = ctc.multiply(BigDecimal.valueOf(0.2)).setScale(2, BigDecimal.ROUND_UP);
		BigDecimal BOA  = ctc.multiply(BigDecimal.valueOf(0.4)).setScale(2, BigDecimal.ROUND_UP);
		String message = "Hello " + empName + ", Your Salary breakdown is as Follows -" + "<br> Base : "  + base.toPlainString() + System.lineSeparator() + "<br> HRA :" + hra.toString() + "<br> BOA : " + BOA.toString();
		return message;
	}

}
