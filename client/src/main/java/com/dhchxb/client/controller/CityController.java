package com.dhchxb.client.controller;

import com.dhchxb.api.model.City;
import com.dhchxb.client.service.CityNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author:dhc
 * @Description:
 * @Date:Create in 11:38 AM 2018/12/14
 * @Modified By:
 */
@RestController
public class CityController {

    @Autowired
    private CityNameService cityNameService;

    @RequestMapping("/dubbo/test")
    public City test4Dubbo(HttpServletRequest request, HttpServletRequest response){
        return cityNameService.findCityByCityName();
    }
}
