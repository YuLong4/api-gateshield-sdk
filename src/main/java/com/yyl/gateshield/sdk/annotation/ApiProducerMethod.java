package com.yyl.gateshield.sdk.annotation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ApiProducerMethod {

    //方法名称
    String methodName() default "";

    //访问路径 /wg/activity/sayHi
    String uri() default "";

    //接口类型 GET、POST、PUT、DELETE
    String httpCommandType() default "GET";

    //是否认证 true = 1, false = 0
    int auth() default 0;
}
