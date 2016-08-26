package com.ssa.ironyard.web;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssa.ironyard.model.Property;

@RestController
public class PropertyRestController {
    
    final static Logger LOGGER = LogManager.getLogger(PropertyRestController.class);
    
   

//    ReponseEntity<List<T>>
    
    @RequestMapping("/realestate/{city}/{street}")
    @ResponseBody
    public List<?> search(@PathVariable String city,@PathVariable String street)
    {
        ResponseEntity.status(HttpStatus.CREATED);
        if(street.equals("Dobbin Rd")&&city.equals("Columbia")){
            LOGGER.debug("Columbia", Arrays.asList(new Property(123000, "Dobbin Rd", 10000),new Property(100000, "Dobbin Rd", 9000)));
            return Arrays.asList(new Property(123000, "Dobbin Rd", 10000),new Property(100000, "Dobbin Rd", 9000));
        
        }
        if(street.equals("PubDog")&&city.equals("Columbia")){
            LOGGER.debug(new Property(90000, "PubDog",8000));
            return Arrays.asList(new Property(90000, "PubDog",8000));
        
        }
        return Collections.emptyList();
    }
    
    @RequestMapping("/realestate/{city}")
    @ResponseBody
    public List<?> search2(@PathVariable String city)
    {
        if(city.equals("Columbia")){
            LOGGER.debug("Columbia", Arrays.asList(new Property(123000, "Dobbin Rd", 10000),new Property(100000, "Dobbin Rd", 9000), new Property(90000, "PubDog",8000)));
            return Arrays.asList(new Property(123000, "Dobbin Rd", 10000),new Property(100000, "Dobbin Rd", 9000), new Property(90000, "PubDog",8000));
        }
        
        if(city.equals("Hell")){
            LOGGER.debug("Hell", Arrays.asList(new Property(1, "Buffalo Wild Wings", 100000)));
            return Arrays.asList(new Property(1, "Buffalo Wild Wings", 100000));
        
        }
    
    return Collections.emptyList();
    }
}
