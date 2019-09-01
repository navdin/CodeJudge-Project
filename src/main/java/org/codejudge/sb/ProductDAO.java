package org.codejudge.sb;

import org.codejudge.sb.models.Product;
import org.graalvm.compiler.core.common.Fields;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Field;
import java.util.HashMap;

public class ProductDAO {

//    @Autowired
//    ProductJpa prodJpa;

    int c=0;
    HashMap<Integer, Product> hm=new HashMap<Integer, Product>();

    public Product getProd(int id){
//        prodJpa.findOne(id);
        Product ps=hm.get(id);
        return ps;

    }

    public Product save(Product p){

//        prodJpa.save(p);

        p.setId(c);
        hm.put(c, p);

        return p;
    }

    public Boolean update(int id, Product p){

        Product ps=hm.get(id);
        if(ps==null){
            return false;
        }
        if(p.getName()!=null){
            ps.setName(p.getName());
        }
        if(p.getBuy_price()!=null){
            ps.setBuy_price(p.getBuy_price());
        }
        if(p.getCategory()!=null){
            ps.setCategory(p.getCategory());
        }
        if(p.getDescription()!=null){
            ps.setDescription(p.getDescription());
        }
        if(p.getQuantity()!=null){
            ps.setQuantity(p.getQuantity());
        }


        return true;
//        Field[] fields=p.getClass().getDeclaredFields();
//        for(Field f: fields){
//            if(f.get(p)!=null){
//                ps.
//            }
//
//        }
    }

    public Boolean delete(int id){
        Product ps=hm.get(id);

//        prodJpa.delete(ps);


        if(ps==null){
            return false;
        }
        hm.remove(id);
        return true;
    }
}
