package com.tl.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//用这个类自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    /**
    * @Description: 生成得到代理类
    * @Param: []
    * @return: java.lang.Object
    * @Author: tl
    * @Date: 2023/5/29
    */
    public Object getProxy(){

        Object o = Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
        return o;
    }

    /** 
    * @Description: 处理代理实例，并返回结果
    * @Param: [proxy, method, args]
    * @return: java.lang.Object
    * @Author: tl
    * @Date: 2023/5/29
    */
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = method.invoke(rent, args);
        return result;
    }
}
