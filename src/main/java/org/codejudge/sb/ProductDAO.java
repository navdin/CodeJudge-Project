package org.codejudge.sb;

import org.codejudge.sb.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.HashMap;

@Service
public class ProductDAO {

//    @Autowired
//    ProductJpa prodJpa;


    HashMap<Integer, Product> hm=new HashMap<Integer, Product>();

    public Product getProd(int id){
//        prodJpa.findOne(id);
        Product ps=hm.get(id);
        return ps;

    }

    public Product save(Product p, int c){

//        prodJpa.save(p);

        p.setId(c);
        hm.put(c, p);

        return p;
    }

    public String update(int id, Product p){

        Product ps=hm.get(id);
        if(ps==null){
            return null;
        }
        if(p.getQuantity()<0){
            return "q";
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


        return "t";
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
