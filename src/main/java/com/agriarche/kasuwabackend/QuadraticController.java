package com.agriarche.kasuwabackend;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/quadratic")
public class QuadraticController {

   final QuadraticService service;

    public QuadraticController(QuadraticService service) {
        this.service = service;
    }

    @PostMapping("")
    public QuadraticAnswer solveQuadratic(@RequestBody QuadraticRequest request){
      return service.solve(request);
    }
}
