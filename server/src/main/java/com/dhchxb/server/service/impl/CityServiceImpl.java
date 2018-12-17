package com.dhchxb.server.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dhchxb.api.model.City;
import com.dhchxb.api.service.CityService;
import org.springframework.stereotype.Component;

/**
 * @Author:dhc
 * @Description:
 * @Date:Create in 10:50 AM 2018/12/14
 * @Modified By:
 */
@Component
@Service(version = "1.0.0",timeout = 5000)
public class CityServiceImpl implements CityService {
    @Override
    public City findCityByName(String cityName) {
        return new City(1l,2l,"北京","中国首都");
    }
}
