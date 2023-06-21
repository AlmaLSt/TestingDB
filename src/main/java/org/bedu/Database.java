package org.bedu;

import javax.xml.crypto.Data;
import java.util.LinkedList;
import java.util.List;

public class Database {

    private List<Product> db;
    public Database(){
        db= new LinkedList<>();
    }
    public void insert(Product data){
        db.add(data);
    }

    public int size(){
        return db.size();
    }

    public Product getById(long id) {
        for (Product product : db) {
            if (product.getId() == id) {
                return product;
            }
        }

        return null;
    }

    public void clear() {
        db.clear();
    }

}