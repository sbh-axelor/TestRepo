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


import net.sf.ehcache.CacheManager;

import com.axelor.app.AppModule;
import com.axelor.auth.AuthModule;
import com.axelor.db.JpaModule;
import com.axelor.rpc.ObjectMapperProvider;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.AbstractModule;


public class DataModule extends AbstractModule {

	  @Override
	  protected void configure() {
		    bind(ObjectMapper.class).toProvider(ObjectMapperProvider.class);
		    
		    // shutdown the cache manager if running
		    if (CacheManager.ALL_CACHE_MANAGERS.size() > 0) {
		      CacheManager.getInstance().shutdown();
		    }
		    
		    install(new JpaModule("testUnit", true, true));
		    install(new AuthModule());
		    install(new AppModule());

		    configureImport();
		  }

		  protected void configureImport() {}
		}