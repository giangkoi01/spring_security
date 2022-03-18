package com.service;


import com.entity.Driver;
import com.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class DriverService {

    @Autowired
    DriverRepository driverRepository;
    public List<Driver> getAll(){
        return driverRepository.findAll();
    }

	public Driver insert(Driver driver) {
        Driver entity =new Driver();
        driverRepository.save(driver);
        entity.setId(driver.getId());
		return entity;
	}

	public Driver findById(int id) {
        Optional<Driver> optional = driverRepository.findById(id);
        if(optional.isPresent()) {
            Driver driver = optional.get();
            return driver;
        }
        return null;

    }

	public Driver update(Driver driver){
        Optional<Driver> optional=driverRepository.findById(driver.getId());
        if (optional.isPresent()){
            Driver entity = optional.get();
            driverRepository.save(driver);
            entity.setId(driver.getId());
            return entity;
        }
        return null;

    }

	public Driver deleteById(int id){
        Optional<Driver> optional = driverRepository.findById(id);
        if (optional.isPresent()) {
            Driver entity = optional.get();
            driverRepository.delete(entity);
            return entity;
        } else {
            return null;
        }
    }

}
