package com.dhchxb.client.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dhchxb.api.model.City;
import com.dhchxb.api.service.CityService;
import org.springframework.stereotype.Service;

/**
 * @Author:dhc
 * @Description:
 * @Date:Create in 1:57 PM 2018/12/14
 * @Modified By:
 */
@Service
public class CityNameService {

    @Reference(version = "1.0.0")
    private CityService cityService;

    public City findCityByCityName(){
        return cityService.findCityByName("北京");
    }
}
