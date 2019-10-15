package ru.borisova;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

public class BeanMap {


    @Resource(name = "AdditionalParams")
    public Map<Integer, String> myMap = new HashMap<>();


    public Map<Integer, String> getMyMap(org.springframework.core.io.Resource myMap) {
        this.myMap = myMap;

        return myMap;

    }

}
