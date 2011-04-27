/*
 * Copyright 2007-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.paoding.rose.web.annotation;

import java.lang.annotation.*;

/**
 * 使用 {@link Interceptor} 标注一个控制器拦截器的名字以及其他设置
 *
 * @author 王志亮 [qieqie.wang@gmail.com]
 */
@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Interceptor {

//    /**
//     * 明确标注拦截器的名字
//     * 
//     * @return
//     */
//    String name() default "";

    /**
     * 对用户的每一个请求，只执行一次拦截？
     *
     * @return
     */
    boolean oncePerRequest() default false;
}