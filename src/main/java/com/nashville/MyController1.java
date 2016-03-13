package com.nashville;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by srujangopu on 3/12/16.
 */
@Controller
public class MyController1 {

    @RequestMapping(value = "/sample", method = RequestMethod.GET)
    public String runSample() {
        return "sample";
    }

    @RequestMapping(value = "/sample2", method = RequestMethod.GET)
    public String runSample2() {
        return "sample2";
    }
}
