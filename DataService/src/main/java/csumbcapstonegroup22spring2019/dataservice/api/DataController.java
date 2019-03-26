package csumbcapstonegroup22spring2019.dataservice.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import csumbcapstonegroup22spring2019.dataservice.api.entities.Hero;
import csumbcapstonegroup22spring2019.dataservice.business.Manager;

@RestController
public class DataController{

    @Autowired
    Manager manager;
    
    @GetMapping("/Data")
    @ResponseBody
    List<Hero> getData () {
        return null;
    }
}