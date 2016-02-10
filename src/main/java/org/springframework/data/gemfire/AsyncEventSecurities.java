package org.springframework.data.gemfire;

import java.util.ArrayList;
import java.util.List;

import model.Security;

import com.gemstone.gemfire.cache.Operation;
import com.gemstone.gemfire.cache.asyncqueue.AsyncEvent;
import com.gemstone.gemfire.cache.asyncqueue.AsyncEventListener;

public class AsyncEventSecurities implements AsyncEventListener{

	public void close() {
		
	}

	public boolean processEvents(List<AsyncEvent> events) {
	System.out.println("Processing events");
	//add lists
/*	 List<Security> newEntries = new ArrayList<Security>();  
     
     List<Security> updatedEntries = new ArrayList<Security>();  
     List<String> destroyedEntries = new ArrayList<String>();  
     int possibleDuplicates = 0;  
       
     for (AsyncEvent ge: events)  
     {  
         
       if (ge.getPossibleDuplicate())  
        possibleDuplicates++;  
          
       if ( ge.getOperation().equals(Operation.UPDATE))   
       {  
      updatedEntries.add((Security) ge.getDeserializedValue());  
       }  
       else if ( ge.getOperation().equals(Operation.CREATE))  
       {  
         newEntries.add((Security) ge.getDeserializedValue());  
       }  
       else if ( ge.getOperation().equals(Operation.DESTROY))  
       {  
      destroyedEntries.add(ge.getKey().toString());  
       }  
			
	}
     OracleDAO.insertSecurity(newEntries);
     OracleDAO.updateSecurity((ArrayList<Security>)updatedEntries);
     
     */
     return true;
	}
}