package Lab1DAO;

import java.util.ArrayList;

public interface DataAccessObjectConcreate <E>{
    ArrayList<E> list();
    Boolean create(E e);
    Boolean update(E e);
    Boolean delete(E e);
}
