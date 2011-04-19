package net.paoding.rose.jade.annotation;

import java.lang.annotation.*;

/**
 * 使用：{#link UseMaster} 标注需要强制查询 master 数据库的 DAO 接口方法。
 *
 * @author han.liao
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface UseMaster {

    /**
     * 是否需要强制查询 master 数据库。
     *
     * @return 强制查询 master 数据库
     */
    boolean value() default true;
}
