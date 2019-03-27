package csumbcapstonegroup22spring2019.dataservice.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import csumbcapstonegroup22spring2019.*;
import csumbcapstonegroup22spring2019.dataservice.api.entities.Hero;

@Service 
public class Manager {
    @Autowired
    // HeroDbClient heroDbClient;

    //TODO: use business entities rather than api/presentation layer entities.

    public List<Hero> getHerolist () {
        return null;
    }
}