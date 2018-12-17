package com.dhchxb.server.filter;

import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.*;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author:dhc
 * @Description:
 * @Date:Create in 2:07 PM 2018/12/14
 * @Modified By:
 */
@Activate
public class DubboInvokeFilter implements Filter {

    private static Logger logger = LoggerFactory.getLogger(DubboInvokeFilter.class);

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {

        String host = RpcContext.getContext().getRemoteHost();
        String interfaceName = invoker.getInterface().getName();
        System.out.println("p------p"+interfaceName+":"+invocation.getMethodName());
        if(StringUtils.isNotEmpty(interfaceName) && interfaceName.startsWith("com.dhchxb.client")){
            Result result = invoker.invoke(invocation);
            return result;
        }
        return null;
    }
}
