package com.learn.learn_swagger.controllers;

import com.learn.learn_swagger.models.MyShop;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

    @RequestMapping(value="/data", method= RequestMethod.GET)
    public ResponseEntity<String> getData(
            @ModelAttribute
            MyShop myshop,
            String inputData) {
        return new ResponseEntity<>("", HttpStatus.OK);
    }

    @RequestMapping(value="/data", method= RequestMethod.POST)
    public ResponseEntity<String> setData(
            @RequestBody
            MyShop myshop,
            String inputData) {
        return new ResponseEntity<>("", HttpStatus.OK);
    }
}
