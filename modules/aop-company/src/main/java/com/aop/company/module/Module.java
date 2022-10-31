package com.aop.company.module;

import com.aop.company.service.SalaryService;
import com.aop.company.service.SalaryServiceImpl;
import com.axelor.app.AxelorModule;

public class Module extends AxelorModule{
	@Override
	protected void configure() {
		bind(SalaryService.class).to(SalaryServiceImpl.class);
	}

}
