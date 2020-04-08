package com.csdj.controller;

import com.csdj.pojo.housetype;
import com.csdj.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TypeController {

    @Autowired
    private TypeService service;


@RequestMapping("/getlist")
    public  List<housetype> getlist(){
    return service.getTypes();
}

}
