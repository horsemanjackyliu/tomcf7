package com.sap.tomcf7;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HtmlController {
  @RequestMapping(path = "/demo", method = RequestMethod.GET)
  public String getDemo(Model model) {
    HashMap<String, Object> reMap = new HashMap<>();
    reMap.put("userName", "Jacky");
    reMap.put("userAge", 20);
    model.addAllAttributes(reMap);
    return "demoHtm";
  }

}
