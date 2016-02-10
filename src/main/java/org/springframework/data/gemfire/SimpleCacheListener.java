package org.springframework.data.gemfire;

import java.util.List;
import java.util.Properties;

import model.Security;

import com.gemstone.gemfire.cache.CacheListener;
import com.gemstone.gemfire.cache.Declarable;
import com.gemstone.gemfire.cache.EntryEvent;
import com.gemstone.gemfire.cache.RegionEvent;
import com.gemstone.gemfire.cache.asyncqueue.AsyncEvent;
import com.gemstone.gemfire.cache.asyncqueue.AsyncEventListener;

public class SimpleCacheListener implements CacheListener, Declarable{

	public void close() {
		// TODO Auto-generated method stub
		
	}

	public void afterCreate(EntryEvent arg0) {
		System.out.println("inserting to the DB the following information New" +(Security)(arg0.getNewValue()));
		System.out.println("inserting to the DB the following information Old" +(Security)(arg0.getOldValue()));
		//OracleDAO.insertSecurity((Security)(arg0.getNewValue()));
		
	}

	public void afterDestroy(EntryEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void afterInvalidate(EntryEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void afterRegionClear(RegionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void afterRegionCreate(RegionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void afterRegionDestroy(RegionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void afterRegionInvalidate(RegionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void afterRegionLive(RegionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void afterUpdate(EntryEvent arg0) {
		System.out.println("updating old value"+((Security)arg0.getOldValue()));
		//OracleDAO.updateSecurity((Security)(arg0.getNewValue()));
	}

	public void init(Properties arg0) {
	}


}
