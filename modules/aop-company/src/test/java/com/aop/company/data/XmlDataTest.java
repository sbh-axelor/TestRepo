/*
 * Axelor Business Solutions
 *
 * Copyright (C) 2005-2022 Axelor (<http://axelor.com>).
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.aop.company.data;


import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.aop.company.db.repo.CountryRepository;
import com.axelor.data.Importer;
import com.axelor.data.xml.XMLImporter;
import com.axelor.inject.Beans;
import com.axelor.test.GuiceModules;
import com.axelor.test.GuiceRunner;

@RunWith(GuiceRunner.class)
@GuiceModules(DataModule.class)

public class XmlDataTest extends DataModule {
	
	@Test
	public void countryImportMethod() throws IOException{
		System.err.println(Beans.get(CountryRepository.class).all().fetch());
		Importer importer = new XMLImporter("data/xml-config.xml", "data/xml");
		importer.run();
		System.err.println(Beans.get(CountryRepository.class).all().fetch());
	}
	
	  @Test
	  public void testTypes() throws IOException {
	    Importer importer = new XMLImporter("data/xml-config-types.xml", "data/xml");
	    importer.run();
	  }

}
