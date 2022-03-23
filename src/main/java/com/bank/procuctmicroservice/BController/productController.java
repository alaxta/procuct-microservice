package com.bank.procuctmicroservice.BController;

import com.bank.procuctmicroservice.MEntity.productEntity;
import com.bank.procuctmicroservice.DRepository.productRepository;
import org.apache.maven.model.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/product")
public class productController {
    @Autowired
    private productRepository productRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<productEntity> getAlProduct(){
    return productRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public  void createProduct(@RequestBody productEntity productEntity){
     productRepository.save(productEntity);
    }
//    public ResponseEntity <List<productEntity>> getAllProduct(){
//    List<productEntity>  productEntities =productRepository.findAll();
//    ResponseEntity <List<productEntity>> responseEntity= new ResponseEntity<>(productEntities,HttpStatus.OK);
//    return responseEntity;
//    }
        //}

    @GetMapping("/{id}")
    public Optional<productEntity> findById(@PathVariable String id){
        return productRepository.findById(id);
    }

    @PutMapping
    public void update(@RequestBody productEntity productEntity){
       productRepository.save(productEntity);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id){
        productRepository.findById(id);
    }
    @GetMapping("/search/{prod}")
    public Optional<productEntity> findByName(@PathVariable String prod){
        return productRepository.findByproductName(prod);
    }
}
