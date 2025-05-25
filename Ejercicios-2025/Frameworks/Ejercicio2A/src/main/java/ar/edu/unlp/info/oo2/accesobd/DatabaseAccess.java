package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;
import java.util.logging.Level;

public interface DatabaseAccess {
    Collection<String> getSearchResults(String queryString);

    int insertNewRow(List<String> rowData);
}