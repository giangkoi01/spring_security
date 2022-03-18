package com.service;


import com.entity.Router;
import com.repository.RouterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RouterService {
    @Autowired
    RouterRepository routerRepository;

    public List<Router> getAll(){
        return routerRepository.findAll();
    }

    public Router insert(Router router) {
        Router entity =new Router();
        routerRepository.save(router);
        entity.setId(router.getId());
        return entity;
    }

    public Router update(Router router){
        Optional<Router> optional=routerRepository.findById(router.getId());
        if (optional.isPresent()){
            Router entity = optional.get();
            routerRepository.save(router);
            entity.setId(router.getId());
            return entity;
        }
        return null;
    }

    public Router findRouterId(int id) {

        Optional<Router> optional = routerRepository.findById(id);
        if(optional.isPresent()) {
            Router router = optional.get();
            return router;
        }
        return null;
    }

    public Router deleteById(int id){
        Optional<Router> optional = routerRepository.findById(id);
        if (optional.isPresent()) {
            Router entity = optional.get();
            routerRepository.delete(entity);
            return entity;
        } else {
            return null;
        }
    }


}
