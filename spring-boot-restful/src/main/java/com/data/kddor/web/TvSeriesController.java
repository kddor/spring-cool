package com.data.kddor.web;

import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by apple on 2019/8/11.
 */
@RestController
@RequestMapping("/tvseries")
public class TvSeriesController {

    private static final Log log = LogFactory.getLog(TvSeriesController.class);

    @GetMapping
    public Map<String,Object> sayHello(){
        if(log.isTraceEnabled()){
            log.trace("sayhello被调用了");
        }
        Map<String,Object> result = new HashMap<>();
        result.put("message","hello，world");
        return result;
    }
}
