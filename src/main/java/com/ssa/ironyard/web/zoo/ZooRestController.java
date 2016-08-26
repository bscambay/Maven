package com.ssa.ironyard.web.zoo;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ssa.ironyard.model.Animal;
import com.ssa.ironyard.web.PropertyRestController;

@RestController
public class ZooRestController {
    final static Logger LOGGER = LogManager.getLogger(PropertyRestController.class);

    List<Animal> zoo = Arrays.asList(
            new Animal("aardvark", "Africa", "The aardvark is sometimes colloquially called African ant bear"),
            new Animal("baboon", "Africa",
                    "Most baboons live in hierarchical troops. Group sizes vary between five and 250 animals (often about 50 or so)"),
            new Animal("chimpanzee", "Africa", "one of two exclusively African species of great ape"),
            new Animal("donkey", "Africa(ancestor)",
                    "A male donkey or ass is called a jack, a female a jenny or jennet."),
            new Animal("elephant", "Africa", "Elephants are the largest living terrestrial animals."),
            new Animal("fish", "Africa, Asia, Australia, Europe,North America, South America",
                    "They can breathe underwater"),
            new Animal("gorilla", "Africa",
                    "The DNA of gorillas is highly similar to that of humans, from 95–99% depending on what is counted, and they are the next closest living relatives to humans after the chimpanzees and bonobos."),
            new Animal("horse", "Africa, Asia, Australia, Europe,North America, South America",
                    "horses are able to sleep both standing up and lying down."),
            new Animal("iguana", "South America",
                    "They have a light-sensing organ known as the parietal eye on the top of their heads"),
            new Animal("jackalope", "North America", "It\'s real"),
            new Animal("kangaroo", "Australia",
                    "The Australian government estimates that 34.3 million kangaroos lived within the commercial harvest areas of Australia in 2011"),
            new Animal("loris", "Asia",
                    "Female lorises practice infant parking, leaving their infants behind in nests. "
                            + "Before they do this, they bathe their young with allergenic saliva that is acquired by licking patches "
                            + "on the insides of their elbows, which produce a mild toxin that discourages most predators, "
                            + "though orangutans occasionally eat lorises."),
            new Animal("manatee", "Asia, Africa, South America",
                    "Manatees are unusual amongst mammals in possessing just six cervical vertebrae,"),
            new Animal("nightingale", "Asia, Europe", "It nests on or near the ground in dense vegetation"),
            new Animal("orangutan", "Asia", "Orangutans are among the most intelligent primates"),
            new Animal("piranha", "South America",
                    "You can block off part of a river and starve piranhas for several days, "
                            + "then you can push a cow into the water, "
                            + " it will be skeletonized and quickly torn apart in moments."),
            new Animal("quail", "Africa, Asia, Australia, Europe,North America, South America",
                    "In 2007, 40 million quail were produced in the U.S."),
            new Animal("rhinoceros", "Africa, Southern Asia",
                    "By weight, rhino horns cost as much as gold on the black market."),
            new Animal("squirrel", "Africa, Austrailia, Europe, Asia, North America, South America",
                    "The largest sqirrel averages at 3ft 7inches"),
            new Animal("tree-frog", "Africa, Austrailia, Europe, Asia, North America, South America",
                    "Many tree frogs can change their color for better camouflage."),
            new Animal("unicorn", "Africa, Austrailia, Europe, Asia, North America, South America", "They are real"),
            new Animal("velociraptor", "Pangea", "They dead"),
            new Animal("whale", "Africa, Austrailia, Europe, Asia, North America, South America",
                    "Whales range in size from the 2.6 metres (8.5 ft) and 135 kilograms (298 lb) dwarf sperm whale to the 29.9 metres (98 ft) "
                            + "and 190 metric tons (210 short tons) blue whale, which is the largest creature that has ever lived."),
            new Animal("x-ray-tetra", "South America",
                    "It is tolerant of (and sometimes found in) slightly brackish water."),
            new Animal("yak", "Asia", "Yak\'s wool is naturally odour resistant."),
            new Animal("zebu", "Asia", "It's just a cow."));

//    @ModelAttribute
//    public void addheader(HttpServletResponse response) {
//        response.setHeader("X-Powered-By", "SSA-Zoo");
//    }

    @RequestMapping(produces = "application/json", value = "/zoo/animals", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Map<String, URI>> handle(HttpServletRequest request) {
        ResponseEntity.status(HttpStatus.CREATED).header("X-Powered-By", "SSA Zoo");
        Map<String, URI> names = new HashMap<>();
        for (int i = 0; i < zoo.size(); i++)
            names.put(zoo.get(i).getName(), URI.create(zoo.get(i).getLink()));
        return ResponseEntity.ok().header("X-Powered-By", "SSA-Zoo").body(names);

    }

    @RequestMapping(produces = "application/json", value = "/zoo/animals/{animal_names}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Animal> detail(@PathVariable String animal_names) {
        for (int i = 0; i < zoo.size(); i++)
            if (animal_names.toLowerCase().equals(zoo.get(i).getName()))
                return  ResponseEntity.ok().header("X-Powered-By", "SSA-Zoo:").body(zoo.get(i));
    
    
        return (ResponseEntity<Animal>) ResponseEntity.status(HttpStatus.NOT_FOUND);
    }
    
//    @RequestMapping(produces = "application/json", value = "/zoo/animals/{continent}", method = RequestMethod.GET)
//    @ResponseBody
//    public ResponseEntity<List<Animal>> where(@PathVariable String continent){
//        List<Animal>temp = new ArrayList<>();
//        for(int i = 0; i <zoo.size();i++)
//        {
//            if(zoo.get(i).getContinent().contains(continent))
//            {
//                temp.add(zoo.get(i));
//            }
//        }
//           return ResponseEntity.ok().header("X-Powered-By", "SSA-Zoo").body(temp);
//    }
    

}
