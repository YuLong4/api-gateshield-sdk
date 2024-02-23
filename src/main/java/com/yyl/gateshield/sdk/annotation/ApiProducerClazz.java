package com.yyl.gateshield.sdk.annotation;

import java.lang.annotation.*;

/**
 * 网关API生产者自定义注解
 */
@Documented
@Retention(RetentionPolicy.RUNTIME) //在运行时保留
@Target({ElementType.TYPE})     //Type指应用于类
public @interface ApiProducerClazz {

    //接口名称
    String interfaceName() default "";

    //接口版本
    String interfaceVersion() default "";
}
