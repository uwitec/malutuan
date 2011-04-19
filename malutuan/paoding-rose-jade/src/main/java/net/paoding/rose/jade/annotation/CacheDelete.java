package net.paoding.rose.jade.annotation;

import java.lang.annotation.*;

/**
 * 使用：{#link CacheDelete} 标注需要在执行后清除缓存的 DAO 接口方法。
 *
 * @author han.liao
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CacheDelete {

    /**
     * 标注需要清除的缓存 Pool
     *
     * @return 缓存 Pool
     */
    String pool() default "default";

    /**
     * 标注需要清除的缓存 Key.
     *
     * @return 缓存 Key
     */
    String[] key();
}
