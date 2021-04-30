package com.don.poker.model;

import java.util.HashMap;
import java.util.Map;

public class Model {
    
    private Map<String, Object> bean = new HashMap<>();
    
    public void putBean(String k, Object v) {
        bean.put(k, v);
    }
    
    public Object getBean(String k) {
        return bean.get(k);
    }
}
