package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataBaseProxy implements DatabaseAccess{

	private DatabaseRealAccess realAccess;
	private Level userLevel;
	public DataBaseProxy() {
		this.realAccess = new DatabaseRealAccess();
	}
	public Collection<String> getSearchResults(String queryString) {
		if(!this.checkAccess(Level.INFO))
			throw new RuntimeException("accesso denegado"); 
		return this.realAccess.getSearchResults(queryString);
	}

	
	public int insertNewRow(List<String> rowData) {
		if(!this.checkAccess(Level.WARNING))
			throw new RuntimeException("accesso denegado"); 
		return this.realAccess.insertNewRow(rowData);
		
	}
	
	private boolean checkAccess(Level requiredLevel) {
	    return this.userLevel.intValue() == requiredLevel.intValue();
	}
	public void setUserLevel(Level lvl) {
		this.userLevel = lvl;
	}
}
