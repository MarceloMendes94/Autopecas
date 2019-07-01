package design_parttens;

import java.util.ArrayList;

public interface BaseDAO {
    public ArrayList<Object> find();
    public void insert(Object obj);
    public void update(Object velho,Object novo);
    public void delete(String query);
    public String transform(Object obj);
}
