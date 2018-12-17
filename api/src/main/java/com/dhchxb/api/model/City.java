package com.dhchxb.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author:dhc
 * @Description:
 * @Date:Create in 10:29 AM 2018/12/14
 * @Modified By:
 */
@Data
@AllArgsConstructor
public class City implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long provinceId;

    private String cityName;

    private String cityDesc;

}
