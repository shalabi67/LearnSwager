package com.learn.learn_swagger.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyShopInterfaceController {

    @RequestMapping(value="/interface", method= RequestMethod.GET)
    public ResponseEntity<String> getData(
            @ModelAttribute
            MyShopInterface myshop,
            String inputData) {
        com.learn.learn_swagger.models.MyShopInterface myShopParam = myshop;
        return new ResponseEntity<>("", HttpStatus.OK);
    }

    @RequestMapping(value="/interface", method= RequestMethod.POST)
    public ResponseEntity<String> setData(
            @RequestBody
            MyShopInterface myshop,
            String inputData) {
        return new ResponseEntity<>("", HttpStatus.OK);
    }
}
