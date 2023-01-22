package com.sap.tomcf7;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping(path = "/service")
public class HelloWorld {
  @GetMapping(path = "/hello")
  public ResponseEntity<String> getHello() {
    return new ResponseEntity<String>("Hello World", HttpStatus.OK);
  }

  @GetMapping(path = "/good/{name}")
  public ResponseEntity<String> getGood(@PathVariable String name) {
    return new ResponseEntity<String>("Good Boy" + name, HttpStatus.OK);
  }

  @GetMapping(path = "/better")
  public ResponseEntity<String> getBetter(@RequestParam String name) {
    return new ResponseEntity<String>("Good Boy" + name, HttpStatus.OK);
  }

  @PostMapping(path = "/best")
  public ResponseEntity<String> getBest(@RequestBody String person) {
    return new ResponseEntity<String>("Good Boy   " + person, HttpStatus.OK);
  }

}
