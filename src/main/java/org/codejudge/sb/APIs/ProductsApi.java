package org.codejudge.sb.APIs;

import org.codejudge.sb.ProductDAO;
import org.codejudge.sb.models.Product;
import org.codejudge.sb.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/products")
public class ProductsApi {

    @Autowired
    ProductDAO pdao;


    int c=0;


    @GetMapping("/{product_id}")
    public ResponseEntity<Response> getProd( @PathVariable("product_id") int pid){
        Product p= pdao.getProd(pid);
        if(p==null){
           return ResponseEntity.notFound().build();
        }
        Response res=new Response();
        res.setData(p);
        return ResponseEntity.ok().body(res);
    }

    @PostMapping("")
    public ResponseEntity<Product> saveProd( @RequestBody Product p) {
        System.out.println("c is= "+c);
        if(p.getQuantity()!=null &&  p.getQuantity()<0){
            return ResponseEntity.status(404).build();
        }
        Product ps=pdao.save(p, c++);
        return ResponseEntity.ok().body(ps);
    }

    @DeleteMapping("/{product_id}")
    public ResponseEntity<Response> delete( @PathVariable("product_id") int pid){

        Boolean b=pdao.delete(pid);
        if(b){
            return ResponseEntity.ok().build();
        }
        Response res=new Response(null, "failure", "product_id not exist");
        return ResponseEntity.badRequest().body(res);
    }

    @PutMapping("/{product_id}")
    public ResponseEntity<Response> put( @PathVariable("product_id") int pid,  @RequestBody Product p){


        String b=pdao.update(pid, p);
        Response res=new Response();
        if(b=="t"){
            res.setStatus("success");
            res.setReason(null);
            return ResponseEntity.ok().body(res);
        }
        else if(b=="q"){
            return ResponseEntity.status(404).build();
        }

        res.setStatus("failure");
        res.setReason("product_id not exist");
        return ResponseEntity.badRequest().body(res);
    }



}
