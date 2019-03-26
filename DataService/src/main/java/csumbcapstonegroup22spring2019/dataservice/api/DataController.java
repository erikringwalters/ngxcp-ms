package csumbcapstonegroup22spring2019.dataservice.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController{
    
    @GetMapping("/Data")
    @ResponseBody
    String getHeroes () {
        return "Data response.";
    }
}