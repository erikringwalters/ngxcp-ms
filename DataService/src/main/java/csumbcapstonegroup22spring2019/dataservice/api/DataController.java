package csumbcapstonegroup22spring2019.dataservice.api;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import csumbcapstonegroup22spring2019.dataservice.api.entities.AlterEgo;
import csumbcapstonegroup22spring2019.dataservice.api.entities.Hero;
import csumbcapstonegroup22spring2019.dataservice.api.entities.Identity;
import csumbcapstonegroup22spring2019.dataservice.business.Manager;
import csumbcapstonegroup22spring2019.dataservice.api.entities.Powers;


@RestController
public class DataController{

    @Autowired
    Manager manager;
    
    @GetMapping("/Data")
    @ResponseBody
    List<Hero> getData () {
        Hero xavier = new Hero("1", new Identity("Charles Xavier"), new AlterEgo("Professor X"), new Powers(Arrays.asList("mind stuff")));
       Hero wolverine = new Hero("2", new Identity("James Howlett"), new AlterEgo("Wolverine"), new Powers(Arrays.asList("strength","rapid healing","metal bones")));
       Hero cyclops = new Hero("3", new Identity("Scott Summers"), new AlterEgo("Cyclops"), new Powers(Arrays.asList("eye beams")));
       List<Hero> result = Arrays.asList(xavier, wolverine, cyclops);
       // List<Hero> result = callDB();
       return result;
    }
}