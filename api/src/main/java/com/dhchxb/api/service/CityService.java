package com.dhchxb.api.service;


import com.dhchxb.api.model.City;

/**
 * @Author:dhc
 * @Description:
 * @Date:Create in 1:52 PM 2018/12/14
 * @Modified By:
 */
public interface CityService {
    City findCityByName(String cityName);
}
