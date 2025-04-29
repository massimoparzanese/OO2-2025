package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;

public class DataBaseProxy implements DatabaseAccess{

	private DatabaseRealAccess realAccess;
	
	public DataBaseProxy() {
		this.realAccess = new DatabaseRealAccess();
	}
	public Collection<String> getSearchResults(String queryString) {
		if(!this.checkAccess())
			throw new RuntimeException("accesso denegado"); 
		return this.realAccess.getSearchResults(queryString);
	}

	
	public int insertNewRow(List<String> rowData) {
		if(!this.checkAccess())
			throw new RuntimeException("accesso denegado"); 
		return this.realAccess.insertNewRow(rowData);
		
	}
	
	public boolean checkAccess() {
		return true;
	}
}
